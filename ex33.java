import java.util.Scanner;
public class ex33 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        double media, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        double soma = 0;
        int contador = 0;

        System.out.println("Digite as temperaturas(pressione 'q' para terminar): ");

        while(true) {
            System.out.print("Temperatura: ");
            String entrada = input.next();

            if (entrada.equals("q")){
                break;
            }

            double temperatura = Double.parseDouble(entrada);

            soma += temperatura;
            contador ++;

            if (temperatura < menor) {
                menor = temperatura;
            }
            if (temperatura > maior) {
                maior = temperatura;
                
            }
        }

        if (contador > 0) {
            media = soma / contador;

            System.out.println("A maior temperatura e: "+ maior);
            System.out.println("A menor temperatura e: "+ menor);
            System.out.println("A media das temperatura e: "+ media);
        }
        else {
            System.out.println("Nao foi inserida nenhuma temperatura");
        }


        input.close();
    }
}
