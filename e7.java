package atividade;
import java.util.Scanner;
public class e7 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println ("Digite sua altura:");
		double altura;
		altura = s.nextDouble();
		System.out.println("O seu peso ideal seria: " + ((72.7 *altura)-58));
	}
		

}
