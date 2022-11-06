import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        System.out.println("Quel seu nome amigo?");

        String name = scann.nextLine(); //nextFloat() nextInt()

        System.out.println("Salve amigo, meu nome é: "+ name);
    }
}
