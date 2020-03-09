import java.util.*;
public class Main {
	
   public static void main(String[] args) { 
   
	   //fill the code
RainfallReport obj=new RainfallReport();

List<AnnualRainfall> cities=obj.findMaximumRainfallCities();
for(AnnualRainfall annualRainfall:cities){
	System.out.println(annualRainfall.getCityName());
}
   }
}
          