package atividade;
import java.util.Scanner; 
public class e6 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println ("Quantas horas voc� trabalhou no m�s?");
		double horas;
		horas = s.nextDouble();
		System.out.println ("Quanto voc� ganha por hora?");
		double valor;
		valor = s.nextDouble();
		System.out.println("Seu sal�rio � de: R$" + (horas*valor));
	}
}