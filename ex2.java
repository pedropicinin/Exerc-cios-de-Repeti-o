import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        String nome, senha;
        boolean condicao = true;

        System.out.println("Digite seu nome de usuario: ");
        nome = input.nextLine();
        System.out.println("Digite sua senha: ");
        senha = input.nextLine();

        while (condicao) {
            if (nome.equals(senha)) {
                System.out.println("Senha deve ser diferente do nome de usuario");
                System.out.println("Digite sua senha novamente: ");
                senha = input.nextLine();
            }
            else {
                System.out.println("Logado");
                break;
            }
        }
        input.close();
    }
}