package atividade;
import java.util.Scanner;
public class e1 {
	public static void main(String args[]) {  
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o quanto deseja inserir na poupan�a:");
		double poupan�a ;
		poupan�a = s.nextDouble();
		double meses ;
		meses = poupan�a + (poupan�a * 0.05);
		System.out.println("A poupan�a render� 5% por m�s, o valor do primeiro m�s ser� de: " + meses);    
}

}
