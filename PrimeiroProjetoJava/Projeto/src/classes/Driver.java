package classes;
import java.util.Scanner;

public class Driver {
    

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.println("Inorme a sua idade: ");
        
        int age = scann.nextInt();
        if(age < 18){
            System.out.println("Não pode dirigir!");
        }else if(age > 18 && age < 21){
            System.out.println("Carteira provisória");
        }else{
            System.out.println("Pode dirigir!");
        }
    }
}
