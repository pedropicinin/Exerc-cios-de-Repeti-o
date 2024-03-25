import java.util.Scanner;
public class ex9 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        int impar = 1;

        for (int i = 1; i <= 50; i++) {
            System.out.println(i);

            i += impar;
        }

        input.close();
    }
}