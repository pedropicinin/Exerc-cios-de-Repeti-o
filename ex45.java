import java.util.Scanner;

public class ex45 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        double mediaTurma = 0;
        int maiorAcerto = 0;
        int menorAcerto = 10;
        int totalAlunos = 0;
        
        String[] gabarito = new String[10];
        
        System.out.println("Digite o gabarito da prova:");

        for (int i = 0; i < gabarito.length; i++) {
            System.out.print("Questão " + (i + 1) + ": ");
            gabarito[i] = input.nextLine().toUpperCase();
        }

        while (true) {
            int contador = 0;

            System.out.println("Digite as respostas do aluno:");

            for (int i = 0; i < gabarito.length; i++) {
                System.out.print("Questão " + (i + 1) + ": ");
                String resposta = input.nextLine().toUpperCase();
                
                if (!resposta.matches("[ABCDE]")) {
                    System.out.println("Resposta inválida! Digite uma resposta de A a E.");
                    i--; 
                    continue; 
                }
                
                if (resposta.equals(gabarito[i])) {
                    contador++;
                }
            }

            double media = (double) contador / gabarito.length;
            
            if (contador > maiorAcerto) {
                maiorAcerto = contador;
            }
            if (contador < menorAcerto) {
                menorAcerto = contador;
            }
            
            mediaTurma += media;
            
            totalAlunos++;

            System.out.println("Deseja inserir as respostas de outro aluno? (S/N)");
            String continuar = input.nextLine();
            
            if (!continuar.equalsIgnoreCase("S")) {
                break; 
            }
        }
        
        mediaTurma /= totalAlunos; 
        
        System.out.println("\n--- Informações ---");
        System.out.println("Maior acerto: " + maiorAcerto);
        System.out.println("Menor acerto: " + menorAcerto);
        System.out.println("Total de alunos que utilizaram o sistema: " + totalAlunos);
        System.out.println("Média das notas da turma: " + (mediaTurma * 100) + "%");

        input.close();
    }
}
