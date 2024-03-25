import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        String nome;
            do {
                System.out.println("Escreva seu nome: ");
                nome = input.nextLine();
            }
            while (nome.length() <= 3);

        int idade;
            do {
                System.out.println("Escreva sua idade: ");
                idade = input.nextInt();
                input.nextLine();
            }
            while (idade <0 || idade > 150);

        double salario;
            do {
                System.out.println("Escreva seu salario: ");
                salario = input.nextDouble();
                input.nextLine();
            }
            while (salario < 0);
        
        String sexo;
            do {
                System.out.println("Escreva seu sexo (f ou m): ");
                sexo = input.nextLine();
            }
            while (!sexo.equals("f") && !sexo.equals("m"));
        
        String estadocivil;
            do {
                System.out.println("Escreva seu estado civil (s, c, v, d): ");
                estadocivil = input.nextLine();
            }
            while (!estadocivil.equals("s") && !estadocivil.equals("c") && !estadocivil.equals("v") && !estadocivil.equals("d"));
        
        System.out.println("Nome: " +nome);
        System.out.println("Idade: " +idade);
        System.out.println("Salario: "+salario);
        System.out.println("Sexo: "+sexo);
        System.out.println("Estado Civil: "+estadocivil);

        input.close();
    }
}