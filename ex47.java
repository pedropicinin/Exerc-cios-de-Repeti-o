import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ex47 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        ArrayList<Double> votos = new ArrayList<>();

        while (true) {
            System.out.println("Nome do atleta: ");
            String nome = input.nextLine();

            if (nome.isEmpty()) {
                break;
            }

            for (int i = 1; i <= 7; i++) {
                System.out.println("Digite a " + i + "º distancia:");
                double nota = input.nextDouble();
                votos.add(nota);
                input.nextLine();
            }

            Collections.sort(votos);

            double melhorNota = votos.get(6);
            double piorNota = votos.get(0);

            votos.remove(0);
            votos.remove(votos.size() - 1);

            double soma = 0;
            for (double distancia : votos) {
                soma += distancia;
            }
            double media = soma / votos.size();

            System.out.println("Resultado final:");
            System.out.println("Atleta: "+nome);
            System.out.println("Melhor nota: "+melhorNota);
            System.out.println("Pior nota: "+piorNota);
            System.out.println("Media: "+media);

        }
    input.close();
    }
}