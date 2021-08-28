# lista-de-exercicios-2-KauanRdzin
lista-de-exercicios-2-KauanRdzin created by GitHub Classroom

import java.util.Scanner;

public class questao06 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, d = 10, r, c = 0;


        System.out.println("Digite um número: ");
        n = scan.nextInt();

        do{
            r = n / d;
            c++;
            d = d * 10;
        }while(r >= 1);
        System.out.printf("Foram informados %d dígito(s)", c);
        scan.close();
    }

}
