import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RainfallReport {

	// Write the required business logic as expected in the question description
	public List<AnnualRainfall> generateRainfallReport(String filePath) {
		List<AnnualRainfall> annualRainfallslist = new ArrayList<AnnualRainfall>();
		File f = null;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			f = new File(filePath);
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String s = null;
			String sp[];
			while ((s = br.readLine()) != null) {
				sp = s.split(",");
				try {
					if (validate(sp[0])) {
						AnnualRainfall annualRainfall = new AnnualRainfall();
						annualRainfall.setCityPincode(Integer.parseInt(sp[0]));
						annualRainfall.setCityName(sp[1]);
						double data[] = new double[12];
						for (int i = 0; i < 12; i++) {
							data[i] = Double.parseDouble(sp[2 + i]);
						}
						annualRainfall.calculateAverageAnnualRainfall(data);
						annualRainfallslist.add(annualRainfall);
					}
				} catch (InvalidCityPincodeException e) {
					e.getMessage();
				}
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return annualRainfallslist;
	}

	public List<AnnualRainfall> findMaximumRainfallCities() {
		List<AnnualRainfall> maximumRainFallCities = new ArrayList<AnnualRainfall>();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try (Connection conn = new DBHandler().establishConnection();) {
			preparedStatement = conn.prepareStatement(
					"select * from annualrainfall where average_annual_rainfall = (select max(average_annual_rainfall) from annualrainfall)");
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				AnnualRainfall annualRainfall = new AnnualRainfall();
				annualRainfall.setCityPincode(resultSet.getInt(1));
				annualRainfall.setCityName(resultSet.getString(2));
				annualRainfall.setAverageAnnualRainfall(resultSet.getDouble(3));
				maximumRainFallCities.add(annualRainfall);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return maximumRainFallCities;
	}

	public boolean validate(String cityPincode) throws InvalidCityPincodeException {
		if (cityPincode.matches("[0-9]{5}")) {
			return true;
		} else {
			throw new InvalidCityPincodeException();
		}

	}

}
