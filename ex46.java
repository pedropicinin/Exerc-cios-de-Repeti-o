import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class ex46 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 

         ArrayList<Double> saltos = new ArrayList<>();
        
        while (true) {
            System.out.println("Nome do atleta: ");
            String nome = input.nextLine();

            if (nome.isEmpty()) {
                break;
            }

            for (int i = 1; i <= 5; i++) {
                System.out.println("Digite a " + i + "º distancia:");
                double distancia = input.nextDouble();
                saltos.add(distancia);
                input.nextLine();
            }

            Collections.sort(saltos);

            double melhorSalto = saltos.get(4);
            double piorSalto = saltos.get(0);

            saltos.remove(0);
            saltos.remove(saltos.size() - 1);

            double soma = 0;
            for (double distancia : saltos) {
                soma += distancia;
            }
            double media = soma / saltos.size();

            System.out.println("Melhor Salto: "+melhorSalto);
            System.out.println("Pior Salto: "+piorSalto);
            System.out.println("Média dos demais saltos: "+ media);


            System.out.println("Resultado final:");
            System.out.println(nome + ": " + String.format("%.2f", media) + " m\n");

            saltos.clear();
        }

        input.close();
    }
}
