package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Digite o número de contribuintes: ");
		int numContribuintes = sc.nextInt();
		
		for(int i = 1; i <= numContribuintes; i++) {
			System.out.println("Contribuinte nº " + i);
			System.out.print("Pessoa Física (F) ou Jurídica (J) ?: ");
			sc.nextLine();
			char tipoPessoa = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();
			if(tipoPessoa == 'F') {
				System.out.print("Gastos com saúde: ");
				double gastosComSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastosComSaude));
			}else {
				System.out.print("Número de funcionários: ");
				int numFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, numFuncionarios));
			}
		}
		
		System.out.println();
		System.out.println("Taxas individuais: ");
		for(Pessoa pessoa : list) {
			System.out.println("Nome: " + pessoa.getNome() + " - Imposto: R$ " + 
					String.format("%.2f", pessoa.calcImposto()));
		}
		
		System.out.println();
		System.out.println("Valor total de impostos: ");
		double soma = 0;
		for(Pessoa pessoa : list) {
			soma += pessoa.calcImposto();
		}
		System.out.println(String.format("R$ %.2f", soma));
		
		sc.close();
	}

}
