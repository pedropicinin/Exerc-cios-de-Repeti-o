import java.util.Scanner;
public class ex38 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        double salario;
        int anoContrato = 1995, anoAtual = java.time.Year.now().getValue();

        System.out.println("Digite o salário inicial do funcionário:");
        double salarioInicial = input.nextDouble();

        salario = salarioInicial;

        for (int ano = anoContrato + 1; ano < anoAtual; ano++) {
            double aumento = (ano - anoContrato) * 0.015;
            salario += salario * aumento;
        }

        System.out.printf("O salario atual: R$%.2f%n", salario);


        input.close();
    }
}