import java.util.Scanner;
public class ex13 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 

        double base, resultado;
        int expoente;
        
        System.out.println("Digite o primeiro numero: ");
        base = input.nextDouble();
        System.out.println("Digite o segundo numero: ");
        expoente = input.nextInt();

        resultado = 1;

        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

        System.out.println("O resultado da potencia e: " + resultado);

        

        input.close();
    }
}