import java.util.Scanner;
public class ex37 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        double mediaA, mediaP;
        double maiorA = Double.MIN_VALUE, menorA = Double.MAX_VALUE;
        double maisP = Double.MIN_VALUE, menosP = Double.MAX_VALUE;
        double somaA = 0, somaP = 0;
        int contador = 0, codigomaisA = 0, codigomenosA = 0, codigomaisP = 0, codigomenosP = 0;

        while (true) {
            System.out.println("Digite seu codigo: ");
            int codigo = input.nextInt();

            if (codigo == 0) {
                break;
            }

            System.out.println("Digite sua altura: ");
            double altura = input.nextDouble();
            System.out.println("Digite seu peso: ");
            double peso = input.nextDouble();

            somaA += altura;
            somaP += peso;
            contador++;

            if (altura > maiorA) {
                maiorA = altura;
                codigomaisA = codigo;
            }
            if (altura < menorA) {
                menorA = altura;
                codigomenosA = codigo;
            }
            if (peso > maisP) {
                maisP = peso;
                codigomaisP = codigo;
            }
            if (peso < menosP) {
                menosP = peso;
                codigomenosP = codigo;
            }
        }

        if (contador > 0) {
            mediaA = somaA / contador;
            mediaP = somaP / contador;

            System.out.println("\nClientes registrados: " + contador);
            System.out.println("Cliente mais alto - Código: " + codigomaisA + ", Altura: " + maiorA + "m");
            System.out.println("Cliente mais baixo - Código: " + codigomenosA + ", Altura: " + menorA + "m");
            System.out.println("Cliente mais gordo - Código: " + codigomaisP + ", Peso: " + maisP + "kg");
            System.out.println("Cliente mais magro - Código: " + codigomaisP + ", Peso: " + menosP + "kg");
            System.out.println("Média de altura dos clientes: " + mediaA + "m");
            System.out.println("Média de peso dos clientes: " + mediaP + "kg");
        }
        else {
            System.out.println("Digite informacoes de um cliente");
        }


        input.close();
    }
}
