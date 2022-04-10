package atividade;
import java.util.Scanner;
public class e4 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println ("Promoção! Levando até 10 livros, o valor da unidade sai por R$8.00");
		System.out.println ("Quantos livros deseja comprar?");
		int livros;
		livros = s.nextInt();
		if (livros<=10) {
			System.out.println ("Total da compra: R$" + (livros*8));
		}
		else {
			System.out.println("Total da compra: R$" + (livros*12));
		}
	}
		

}
