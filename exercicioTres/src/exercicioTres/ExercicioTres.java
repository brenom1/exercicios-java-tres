package exercicioTres;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		int numeroFuncionario = sc.nextInt();
		int horaTrabalhada = sc.nextInt();
		double salario = sc.nextDouble();

		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f", horaTrabalhada * salario);
		
		
		
		sc.close();
	}
}