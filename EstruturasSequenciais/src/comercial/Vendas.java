package comercial;

import java.util.Locale;
import java.util.Scanner;

public class Vendas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int codi1, quant1, codi2, quant2;
		double preco1, preco2, total;
		
		codi1 = sc.nextInt();
		quant1 = sc.nextInt();
		preco1 = sc.nextDouble();
		
		codi2 = sc.nextInt();
		quant2 = sc.nextInt();
		preco2 = sc.nextDouble();
		
		total = quant1 * preco1 + quant2 * preco2;
		
		System.out.printf("O valor total a pagar é: R$ %f.2%n ", total);
		
		
		
		sc.close();

	}

}
