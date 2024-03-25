import java.util.Scanner;
public class ex27 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 

    while (true) {
        System.out.println("Digite a quantidade de turma:");
        int t = input.nextInt();

        int soma = 0;
        double media;

        for (int i = 1; i <= t; i++) {
            System.out.println("Digite a quantidade de alunos na " + i + "º sala: ");
            int n = input.nextInt();

            soma += n;
        }
        
        media = (double) soma / t;

        if (media <= 40){
            System.out.println("A media de alunos por turma e: " + media);
            break;
        }
        else {
            System.out.println("A media de alunos por turma nao pode ser maior que 40");
        }

    }
    }
}
