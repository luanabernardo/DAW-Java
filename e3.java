package atividade;
import java.util.Scanner;
public class e3 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println ("Digite o n�mero do seu lanche de acordo com a tabela abaixo:"+"\n"+"101.Cachorro quente"+"\n"+"102.Bauru simples"+"\n"+"103.Bauru com ovo"+"\n"+"104.Hamb�rguer"+"\n"+"105.Cheeseburguer"+"\n"+"106.Refrigerante");
		int lanche;
		lanche = s.nextInt();
		System.out.println("Digite a quantidade desejada:");
		int quantidade;
		quantidade = s.nextInt();
		if (lanche==101) {
			System.out.println("O valor da pedido � de R$"+ 1.2 * quantidade);
		}
		else if (lanche==102) {
			System.out.println("O valor da pedido � de R$"+ 1.3 * quantidade);
		}
		else if (lanche==103) {
			System.out.println("O valor da pedido � de R$"+ 1.5 * quantidade);
		}
		else if (lanche==104) {
			System.out.println("O valor da pedido � de R$"+ 1.2 * quantidade);
		}
		else if (lanche==105) {
			System.out.println("O valor da pedido � de R$"+ 1.3 * quantidade);
		}
		else if (lanche==106) {
			System.out.println("O valor da pedido � de R$"+ 1 * quantidade);
		}
		else {
			System.out.println("N�mero do pedido inv�lido");
		}
	}

}
