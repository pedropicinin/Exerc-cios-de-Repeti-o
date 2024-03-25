import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 

            System.out.println("Embaixo:");
            for (int i = 1; i <= 20; i++) {
                System.out.println(i);
            }
            System.out.println("Lado a Lado: ");
            for (int i = 1; i <= 20; i++) {
                System.out.print(i + " ");
            }
        

        input.close();
    }
}