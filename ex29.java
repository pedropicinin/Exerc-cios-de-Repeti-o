import java.util.Scanner;
public class ex29 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
    while (true) {
        
        System.out.println("Digite a quantidade de itens:");
        int itens = input.nextInt();

        double preco = 1.99;

        if (itens >= 0 && itens <= 50){
            System.out.println("Lojas Quase Dois - Tabela de preços");
            for (int i = itens; i > 0; i--){
                double total = preco * i;
                System.out.println(i+" - R$" + total);
            }
            break;
        }
        else {
            System.out.println("Digite ate 50 produtos");
        }
    }
        input.close();
    }
}