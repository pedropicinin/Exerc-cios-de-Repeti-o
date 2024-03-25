import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        int paisA = 80000, paisB = 200000, anos = 0;
        double taxaA = 0.03, taxaB = 0.015;

        while (paisA < paisB) {
            paisA *= (1 + taxaA);
            paisB *= (1 + taxaB); 
            anos += 1;
        }

        System.out.println("Para a populacao do pais A igualar a populacao do pais B sera necessario "+anos+" anos.");


        input.close();
    }
}


