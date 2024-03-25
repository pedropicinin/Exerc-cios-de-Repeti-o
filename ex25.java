import java.util.Scanner;
public class ex25 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Digite a quantidade de pessoas: ");
        int n = input.nextInt();

        int soma = 0;
        double media;

        for (int i = 1; i < n; i++) {
            System.out.println("Digite a " + i + "º idade:");
            double num = input.nextDouble();
            soma += num;
        }
        
        media = (double) soma / n;

        if (media >= 0 && media <= 10){
            System.out.println("A turma e jovem"); 
        }
        else if (media >= 26 && media < 60) {
            System.out.println("A turma e adulta"); 
        }
        else {
            System.out.println("A turma e idosa");
        }

        input.close();
    }
}