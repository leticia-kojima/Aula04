import java.util.Scanner;

public class EntendendoWhile {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int contador = 1, idade, totalAlunos;
		double media=0;
		
		System.out.println("Quantos alunos tem na turma?");
		totalAlunos = leitor.nextInt();
		
		while(contador <= totalAlunos) {
			System.out.println("Digite a idade do "+ contador +"º aluno:");
			
			idade = leitor.nextInt();
			
			media = media + idade;
			
			contador = contador + 1;
		}
		
		media = media/totalAlunos;
		
		System.out.println("A média de idades é: "+ media);
		
		leitor.close();

	}

}
