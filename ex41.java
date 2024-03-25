import java.util.Scanner;

public class ex41 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Digite o valor da dívida: ");
        double divida = input.nextDouble();

        System.out.println("Digite a quantidade de parcelas (1, 3, 6, 9 ou 12): ");
        int numParcelas = input.nextInt();

        double valorJuros = 0;
        switch (numParcelas) {
            case 1:
                valorJuros = 0;
                break;
            case 3:
                valorJuros = 10;
                break;
            case 6:
                valorJuros = 15;
                break;
            case 9:
                valorJuros = 20;
                break;
            case 12:
                valorJuros = 25;
                break;
            default:
                System.out.println("Número de parcelas inválido!");
                input.close();
                return;
                
        }
        
        double valorTotal = divida + (divida * valorJuros / 100);
        double valorParcela = valorTotal / numParcelas;

        System.out.println("Valor da Dívida | Valor dos Juros | Quantidade de Parcelas | Valor da Parcela | Valor a Pagar");
        System.out.printf("R$ %.2f        | R$ %.2f          | %d                       | R$ %.2f | R$ %.2f\n", divida, valorJuros, numParcelas, valorParcela, valorTotal);

        input.close();
    }
}
