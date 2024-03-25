import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        int nota;
        boolean condicao = true;

        System.out.println("Digite uma nota de 1 a 10: ");
        nota = input.nextInt();

        while (condicao) {
            if (nota >= 0 && nota <= 10 ) {
                System.out.println("Valor: "+nota);
                break;
            }
            else {
                System.out.println("Valor Invalido"); 
                System.out.println("Digite uma nota novamente: ");
                nota = input.nextInt();
            }
    }
        input.close();
    }
}