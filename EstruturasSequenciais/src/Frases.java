import java.util.Locale;

public class Frases {

	public static void main(String[] args) {

		String product1 = "Computer";
		String product2 = "Office Desk";

		byte age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double meansure = 53.234567;

		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which prtice is $ %.2f%n", product2, price2);

		System.out.println();

		System.out.printf("Record: %d years old, code: %d and gender: %c%n", age, code, gender);

		System.out.println();

		System.out.printf("Meansure with eight decimal places: %f.8%n", meansure);
		System.out.printf("Rouded (Three decimal places): %.3f%n", meansure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", meansure);

	}

}
