package atividade;
import java.util.Scanner;
public class e1 {
	public static void main(String args[]) {  
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o quanto deseja inserir na poupança:");
		double poupança ;
		poupança = s.nextDouble();
		double meses ;
		meses = poupança + (poupança * 0.05);
		System.out.println("A poupança renderá 5% por mês, o valor do primeiro mês será de: " + meses);    
}

}
