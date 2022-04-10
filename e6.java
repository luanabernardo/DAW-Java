package atividade;
import java.util.Scanner; 
public class e6 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println ("Quantas horas você trabalhou no mês?");
		double horas;
		horas = s.nextDouble();
		System.out.println ("Quanto você ganha por hora?");
		double valor;
		valor = s.nextDouble();
		System.out.println("Seu salário é de: R$" + (horas*valor));
	}
}