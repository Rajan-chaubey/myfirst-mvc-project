import java.util.*;
import java.io.*;
import java.sql.*;

public class RainfallReport {

	public List<AnnualRainfall> generateRainfallReport(String filePath) throws  FileNotFoundException{
	    
		//fill the code
		ArrayList<AnnualRainfall> list=new ArrayList<>();
		AnnualRainfall allCityList=new AnnualRainfall();
		try{
			FileReader reader=new FileReader(filePath);
			BufferedReader br=new BufferedReader(reader);
			String line=null;
			while((line=br.readLine())!=null)
			{
				String[] allCity= line.split(",");
			allCityList.setCityPincode(Integer.parseInt(allCity[0]));
			if(validate(allCity[0]))
				allCityList.setCityName(allCity[1]);
			else
				throw new InvalidCityPincodeException("Invalid");
			allCityList.getAverageAnnualRainfall();
				
			
		}
			list.add(allCityList);		
		}
		catch(NumberFormatException | IOException | InvalidCityPincodeException e)
		{
			
		}
	return list;
}

	
	public List<AnnualRainfall>  findMaximumRainfallCities() {
	
		//fill the code
		List<AnnualRainfall>list_max=new ArrayList<>();
		AnnualRainfall ar=new AnnualRainfall();
		final String query="Select city_name from AnnualRainfall where avereage_annual_rainfall=(select max(avereage_annual_rainfall) from AnnualRainfall)";
		try{
			Connection con=DBHandler.establishConnection();
			PreparedStatement stmt=con.prepareStatement(query);
			ResultSet rs=stmt.executeQuery();
			while(rs.next())
			{
				int cityCode=rs.getInt("city_name");
				String cityName=rs.getString("city_name");
				double avg=rs.getDouble("average_annual_rainfall");
				ar.setCityPincode(cityCode);
				ar.setAverageAnnualRainfall(avg);
				list_max.add(ar);
			}
		}catch(Exception e)
		{
			
		}
		return list_max;
		
	}
	
	
	public boolean validate(String cityPincode) throws InvalidCityPincodeException {
	
		//fill the code
		if(cityPincode.matches("^[0-9]{5}$"))
			return true;
		else
			return false;
	}

}
