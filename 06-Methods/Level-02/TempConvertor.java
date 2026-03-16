public class TempConvertor {
	public static double convertFarhenheitToCelsius(double farhenheit) {
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
		return farhenheit2celsius;
    }
	public static double convertCelsiusToFarhenheit(double celsius) {
		double celsius2farhenheit = (celsius * 9 / 5) + 32;
		return celsius2farhenheit;
    }
	public static double convertPoundsToKilograms(double pounds) {
		double pounds2kilograms = 0.453592;
		return pounds * pounds2kilograms;
    }
	public static double convertKilogramsToPounds(double kilograms) {
		double kilograms2pounds = 2.20462;
		return kilograms * kilograms2pounds;
    }
	public static double convertGallonsToLiters(double gallons) {
		double gallons2liters = 3.78541;
		return gallons * gallons2liters;
	}
	public static double convertLitersToGallons(double liters) {
		double liters2gallons = 0.264172;
		return liters * liters2gallons;
	}
	public static void main(String[] args) {
		System.out.println("100 Fahrenheit = " + convertFarhenheitToCelsius(100) + " Celsius");
		System.out.println("37 Celsius = " + convertCelsiusToFarhenheit(37) + " Fahrenheit");
		System.out.println("150 Pounds = " + convertPoundsToKilograms(150) + " Kilograms");
		System.out.println("70 Kilograms = " + convertKilogramsToPounds(70) + " Pounds");
		System.out.println("5 Gallons = " + convertGallonsToLiters(5) + " Liters");
		System.out.println("10 Liters = " + convertLitersToGallons(10) + " Gallons");
    }
}