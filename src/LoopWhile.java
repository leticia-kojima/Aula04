import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a média de idades dos alunos de uma escola.
		 * Sabendo de antemão quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual é a melhor forma de calcular essa média?*/
		
		Scanner leitor = new Scanner(System.in);
		int idade;
		double media=0;
		
		System.out.println("Digite a idade do 1º aluno:");
		idade = leitor.nextInt();
		media = media + idade;
		
		System.out.println("Digite a idade do 2º aluno:");
		idade = leitor.nextInt();
		media = media + idade;
		
		System.out.println("Digite a idade do 3º aluno:");
		idade = leitor.nextInt();
		media = media + idade;
		
		System.out.println("Digite a idade do 4º aluno:");
		idade = leitor.nextInt();
		media = media + idade;
		
		System.out.println("Digite a idade do 5º aluno:");
		idade = leitor.nextInt();
		media = media + idade;
				
		media = media/5;
		
		System.out.println("A média de idades é "+ media);
		
		leitor.close();

	}

}
