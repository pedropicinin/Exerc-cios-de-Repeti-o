import java.util.Scanner;
public class ex18 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        int numero, soma = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;


        System.out.println("Quantos numeros voce quer inserir: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite o " + i + "º número:");
            numero = input.nextInt();

            soma += numero;
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("A soma dos números: " + soma);
        System.out.println("O maior número: " + maior);
        System.out.println("O menor número: " + menor);
        

        input.close();
    }
}