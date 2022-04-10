package atividade;
import java.util.Scanner;
public class e5 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println ("Digite seu nome:");
		String nome;
		nome = s.next();
		System.out.println ("Digite sua idade:");
		int idade;
		idade = s.nextInt();
		System.out.println ("Digite seu sexo: Feminino ou Masculino.");
		String sexo;
		sexo = s.next();
		System.out.println ("Salário fixo:");
		double salario;
		salario = s.nextDouble();
		if(sexo.equalsIgnoreCase("Masculino") && (idade>=30)) {
			System.out.println ("Olá "+ nome +", seu abono mensal é de R$100."+ "\n"+ "Seu salário ficou: R$"+ (salario+100));
			}
		else if(sexo.equalsIgnoreCase("Masculino") && (idade<30)) {
			System.out.println ("Olá " + nome + ", seu abono mensal é de R$50."+"\n"+ "Seu salário ficou: R$"+ (salario+50));
			}
		else if(sexo.equalsIgnoreCase("Feminino") && (idade>=30)) {
			System.out.println ("Olá " + nome + ", seu abono mensal é de R$200."+"\n"+ "Seu salário ficou: R$"+ (salario+200));
		}
		else if(sexo.equalsIgnoreCase("Feminino") && (idade<30)) {
			System.out.println ("Olá " + nome + ", seu abono mensal é de R$80."+"\n"+ "Seu salário ficou: R$"+ (salario+80));
		}
		else {
			System.out.println("Alguma informação está incorreta!");
		}
		
		
	}

}
