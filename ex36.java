import java.util.Scanner;
public class ex36 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Digite o primeiro numero: ");
        int num = input.nextInt();
        System.out.println("Digite o numero que quer comecar: ");
        int comecar = input.nextInt();
        System.out.println("Digite o numero que quer terminar: ");
        int terminar = input.nextInt();

    

        if (terminar > comecar) {
            System.out.println("Montar a tabuada de: " + num);
        System.out.println("Começar por: " + comecar);
        System.out.println("Terminar em: " + terminar);
        
        System.out.println("Vou montar a tabuada de "+num+" começando em "+comecar+" e terminando em "+terminar+":");
            
            for (int i = comecar; i <= terminar; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
        }
        }
        else {
            System.out.println("Voce deve digitar o valor terminar maior que o comecar");
        }
        input.close();
    }
}
