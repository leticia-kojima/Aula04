import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a m�dia de idades dos alunos de uma escola.
		 * Sabendo de antem�o quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual � a melhor forma de calcular essa m�dia?*/
		
		Scanner leitor = new Scanner(System.in);
		int idade;
		double media=0;
		
		System.out.println("Digite a idade do 1� aluno:");
		idade = leitor.nextInt();
		media = media + idade;
		
		System.out.println("Digite a idade do 2� aluno:");
		idade = leitor.nextInt();
		media = media + idade;
		
		System.out.println("Digite a idade do 3� aluno:");
		idade = leitor.nextInt();
		media = media + idade;
		
		System.out.println("Digite a idade do 4� aluno:");
		idade = leitor.nextInt();
		media = media + idade;
		
		System.out.println("Digite a idade do 5� aluno:");
		idade = leitor.nextInt();
		media = media + idade;
				
		media = media/5;
		
		System.out.println("A m�dia de idades � "+ media);
		
		leitor.close();

	}

}
