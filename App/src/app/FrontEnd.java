package app;
import java.util.Scanner;

 class FrontEnd {
    public int menu(){
    Scanner receber = new Scanner(System.in);
        System.out.println("-------------------------------");
        System.out.println("Escolha seu processador");
        System.out.println("Digite o número respectivo");
        System.out.println("[1]M4 Max");
        System.out.println("[2]Snapdragon 8 Elite");
        System.out.println("[3]Intel Ultra");
        System.out.println("[4]AMD");
        int resposta = receber.nextInt();
        System.out.println("--------------------------------");
        return resposta;
    }  
}
