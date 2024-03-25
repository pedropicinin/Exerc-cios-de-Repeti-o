import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        int paisA , paisB, anos = 0;
        double taxaA, taxaB, decimalA, decimalB;

        while (true) {
            try {
                System.out.println("Qual a poupacao do pais A: ");
                paisA = input.nextInt();
                System.out.println("Qual a poupacao do pais B: ");
                paisB = input.nextInt();
                System.out.println("Qual a taxa de crescimento anual do pais A: ");
                taxaA = input.nextDouble();
                System.out.println("Qual a taxa de crescimento anual do pais B: ");
                taxaB = input.nextDouble();
                break;
            }
            catch (Exception e){
                System.out.println("Valor Invalido");
                input.nextLine();
            }
        }
        decimalA = taxaA / 100;
        decimalB = taxaB / 100;

        while (paisA < paisB) {
            paisA *= (1 + decimalA);
            paisB *= (1 + decimalB); 
            anos += 1;
        }

        System.out.println("Para a populacao do pais A igualar a populacao do pais B sera necessario "+anos+" anos.");


        input.close();
    }
}