package atividade;
import java.util.Scanner;
public class e2 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println ("Digite o número da sua região:"+"\n"+"1.Norte"+"\n"+"2.Sul"+"\n"+"3.Sudeste"+"\n"+"4.Nordeste"+"\n"+"5.Centro-Oeste");
		int regiao;
		regiao = s.nextInt();
		System.out.println ("Digite o preço do produto:");
		double valor;
		valor = s.nextDouble();
		if (regiao==1) {
			System.out.println ("Você recebeu um desconto de 5%: " + (valor - (valor*0.05)));}
		else if (regiao==2) {
				System.out.println ("Você recebeu um desconto de 15%: " + (valor - (valor*0.15)));
		}
		else if (regiao==3) {
			System.out.println ("Você recebeu um desconto de 7%: " + (valor - (valor*0.07)));
	}
		else if (regiao==4) {
			System.out.println ("Você recebeu um desconto de 12%: " + (valor - (valor*0.12)));
	}
		else if (regiao==5) {
			System.out.println ("Você recebeu um desconto de 20%: " + (valor - (valor*0.20)));
	}
		else {
			System.out.println ("Número de região inválido ou o produto é importado");
		}
	}

	}
	
