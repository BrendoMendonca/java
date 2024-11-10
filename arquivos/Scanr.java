import java.util.Scanner;

public class Scanr{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = leitor.next();//recebe uma string

        System.out.print("Digite um valor inteiro: ");
        int valor = leitor.nextInt();//recebe um inteiro

        System.out.printf("Nome: %s\n", nome);
        System.out.printf("O valor lido é: %d", valor);

    }
}