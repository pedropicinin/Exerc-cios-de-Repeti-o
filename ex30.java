import java.util.Scanner;
public class ex30 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 

        System.out.println("Digite o preco do pao:");
        double preco = input.nextDouble();


            System.out.println("Panificadora Pão de Ontem - Tabela de preços");
            for (int i = 1; i <= 50; i++){
                double total = preco * i;
                System.out.println(i+" - R$" + total);
            }

        input.close();
    }
}
