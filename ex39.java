import java.util.Scanner;
public class ex39 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 

        double maisA = Double.MIN_VALUE;
        double maisB = Double.MAX_VALUE;
        int numA = 0, numB = 0;

        for (int i = 0; i <= 10; i++) {
            System.out.println("Digite seu numero: ");
            int num = input.nextInt();
            System.out.println("Digite sua altura: ");
            double altura = input.nextDouble();

            

            if (altura > maisA) {
                maisA = altura;
                numA = num; 
            }
            if (altura < maisB) {
                maisB = altura;
                numB = num; 
            }
        }

        System.out.println("O aluno mais alto e o numero "+numA+" com a altura "+maisA+"m");
        System.out.println("O aluno mais baixo e o numero "+numB+" com a altura "+maisB+"m");
        

        input.close();
    }
}