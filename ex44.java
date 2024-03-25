import java.util.Scanner;
public class ex44 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        int candidato1 = 0, candidato2 = 0 , candidato3 = 0, votonulo = 0, votoembranco = 0;

        System.out.println("Digite a quantidade de eleitores: ");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite seu voto: ");
            int voto = input.nextInt();
                switch (voto) {
                    case 1:
                        candidato1++;        
                        break;
                    case 2:
                        candidato2++; 
                        break;
                    case 3:
                        candidato3++; 
                        break;
                    case 4:
                        votonulo++; 
                        break;
                    case 5:
                        votoembranco++;
                        break;
                    default:
                        System.out.println("Voto inválido! Por favor, escolha um número entre 1 e 3.");
                        i--; 
                }
        }

        double porcvotonulo = (double)votonulo / n * 100;
        double porcvotobranco = (double)votoembranco / n * 100;
        
        System.out.println("O primeiro candidato teve: " + candidato1 + " votos");
        System.out.println("O segundo candidato teve: " + candidato2 + " votos");
        System.out.println("O terceiro candidato teve: " + candidato3 + " votos");
        System.out.println("A quantidade de votos nulos foi: " + votonulo + " A procentagem foi: "+porcvotonulo+"%");
        System.out.println("A quantidade de votos em branco foi: " + votoembranco + " A procentagem foi: "+porcvotobranco+"%");

        input.close();
    }
}
