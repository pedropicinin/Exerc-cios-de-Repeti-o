import java.util.Scanner;
public class ex40 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 

        int maiorA = Integer.MIN_VALUE, menorA = Integer.MAX_VALUE;
        double mediatotal = 0, mediamenos = 0;
        int codigoMais = 0, codigoMenos = 0, cidadesMenos2000 = 0;

        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o codigo da cidade: ");
            int codigo = input.nextInt();
            System.out.println("Numero de veiculos de passeio(1999): ");
            int veiculos = input.nextInt();
            System.out.println("Numero de acidentes de transitos com vitimas(1999): ");
            int acidentes = input.nextInt();

            if (acidentes > maiorA){
                maiorA = acidentes;
                codigoMais = codigo;
            }
            if (acidentes < menorA){
                menorA = acidentes;
                codigoMenos = codigo;
            }

            mediatotal = veiculos / 5;

            if (veiculos <= 2000) {
                mediamenos += acidentes;
                cidadesMenos2000++;
            }
        }

        mediamenos /= cidadesMenos2000;


        System.out.println("A cidade com mais acidentes e a "+codigoMais+" com "+maiorA);
        System.out.println("A cidade com menos acidentes e a "+codigoMenos+" com "+menorA);
        System.out.println("A media de veiculos nas 5 cidades: "+mediatotal);
        System.out.println("a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio: "+mediamenos);

        input.close();
    }
}
