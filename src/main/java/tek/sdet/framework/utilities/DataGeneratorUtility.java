package tek.sdet.framework.utilities;

import net.datafaker.Faker;

public class DataGeneratorUtility {
	
	public static void main(String []args){
		
		System.out.println(data("firstName"));
		System.out.println(data("lastName"));
		System.out.println(data("fullName"));
		System.out.println(data("email"));
		System.out.println(data("phoneNumber"));
		System.out.println(data("address"));
		System.out.println(data("city"));
		System.out.println(data("state"));
		System.out.println(data("zipCode"));
		System.out.println(data("expression"));
		
	}
	
	

	public static String data(String input) {
		
		Faker faker = new Faker();
		
		String output="";
		
		
		if (input.equals("firstName")) {
			
			output = faker.name().firstName();
		}
		else if(input.equals("lastName")) {
			output =  faker.name().lastName();
		}
		else if(input.equals("email")) {
			output = faker.expression("#{letterify '????.????@tekschool.us'}");
			
		}
		else if(input.equals("phoneNumber")) {
			output = faker.phoneNumber().cellPhone();
			
		}
		else if(input.equals("fullName")) {
			output = faker.name().fullName();
		}
		else if (input.equals("streetAddress")) {
			output = faker.address().streetName();
		}
		
		else if (input.equals("city")) {
			output = faker.address().city();
		}
		
		else if (input.equals("state")) {
			output = faker.address().state();
		}
		else if (input.equals("zipCode")) {
			output = faker.address().zipCode();
		}
		else if(input.equals("country")){
			output = "United States";
		}
		else if(input.equals("apt")){
			output = faker.address().secondaryAddress();
		}
		else output = faker.expression("#{numerify '################'}");
		
		
		return output;
				
	}
	
}
