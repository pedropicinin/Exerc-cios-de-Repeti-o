import java.util.Scanner;
public class ex15 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Digite o valor de n: ");
        int n = input.nextInt();

        int termoAnterior = 0;
        int termoAtual = 1;
        int resultado;

        for (int i = 0; i < n; i++) {
            resultado = termoAnterior + termoAtual;
            termoAnterior = termoAtual;
            termoAtual = resultado;
            System.out.print(resultado + " ");
            }

        input.close();
    }
}
