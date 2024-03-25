import java.util.Scanner;

public class ex43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[] precos = {1.20, 1.30, 1.50, 1.20, 1.30, 1.00};
        
        int[] codigos = {100, 101, 102, 103, 104, 105};
        
        double totalGeral = 0;
        
        System.out.println("Digite o código do item desejado e a quantidade (Digite 0 para finalizar o pedido): ");
        while(true) {
            System.out.print("Código do item (0 para finalizar): ");
            int codigo = input.nextInt();
            
            if (codigo == 0) {
                break;
            }
            
            System.out.print("Quantidade: ");
            int quantidade = input.nextInt();
            
            int index = -1;
            for (int i = 0; i < codigos.length; i++) {
                if (codigo == codigos[i]) {
                    index = i;
                    break;
                }
            }
            
            if (index == -1) {
                System.out.println("Código inválido!");
                continue;
            }
            
            double valorItem = precos[index] * quantidade;
            
            totalGeral += valorItem;
            
            System.out.printf("Valor a ser pago pelo item: R$ %.2f\n", valorItem);
        }
        
        System.out.printf("Total geral do pedido: R$ %.2f\n", totalGeral);
        
        input.close();
    }
}
