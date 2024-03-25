import java.util.Scanner;
public class ex16 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        int termoAnterior = 0;
        int termoAtual = 1;
        int proximo;

        while (termoAtual <= 500){
            proximo = termoAnterior + termoAtual;
            if (proximo > 500) {
                break;
            }
            System.out.print(proximo + " ");
            proximo = termoAnterior + termoAtual;
            termoAnterior = termoAtual;
            termoAtual = proximo;
        }

        input.close();
    }
}

