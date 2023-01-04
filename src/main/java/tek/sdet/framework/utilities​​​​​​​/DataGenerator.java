package tek.sdet.framework.utilities​​​​​​​;

import com.github.javafaker.Faker;

public class DataGenerator {

	public static String addressGenerator(String input) {	
		Faker faker = new Faker();
		
		String output ="";
		
		
	if(input.equalsIgnoreCase("countryValue")) {
				output = "United States";
		
	}else if(input.equalsIgnoreCase("fullnameValue")) {
			output = faker.name().fullName();
	
	}else if(input.equalsIgnoreCase("phoneValue")) {
		output = faker.phoneNumber().cellPhone();
	}else if(input.equalsIgnoreCase("stAddress")) {
		output = faker.address().streetAddress();
	}else if(input.equalsIgnoreCase("aptValue")) {
		output = faker.address().secondaryAddress();
	}else if(input.equalsIgnoreCase("cityValue")) {
		output = faker.address().city();
	}else if(input.equalsIgnoreCase("stateVlue")) {
		output = faker.address().state();
	}else if(input.equalsIgnoreCase("zipCodeValue")) {
		String zipcode = faker.address().zipCode().substring(0,5);
		output = faker.address().zipCode();
	}
	return output;
		
	}
	public static void main(String[] arg ) {
	
		
	}	
	}

