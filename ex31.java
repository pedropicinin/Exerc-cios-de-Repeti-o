import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
     
        while (true) {
            double total = 0;

            while (true) {
                System.out.println("Digite o preço da mercadoria (ou 0 para finalizar a compra): ");
                double preco = input.nextDouble();

                if (preco == 0) {
                    break;
                }

                total += preco;

                System.out.println("Total da compra: R$" + total);
            }
            
            System.out.println("Digite o valor fornecido pelo cliente:");
            double valorFornecido = input.nextDouble();
            double troco = valorFornecido - total;
            
            System.out.println("Total da compra: R$" + total);
            System.out.println("Troco: R$" + troco);
        }
    }
}
