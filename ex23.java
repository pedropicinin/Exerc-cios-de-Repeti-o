import java.util.Scanner;
public class ex23 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Digite o valor de n: ");
        int n = input.nextInt();

        for (int num = 1; num < n; num++) {
            int divisores = 0;

            if (num <=1 ) {
                divisores = 0;
            }
            else{
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        divisores ++;
                    }
                }
            }

            if (divisores == 0) {
                System.out.println(num + " e um numero primo");
            }
            else{
                System.out.println(num + " nao e um numero primo. E divisel por: "+divisores);
            }
                

            input.close();
        }
    }
}