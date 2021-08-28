# lista-de-exercicios-2-KauanRdzin
lista-de-exercicios-2-KauanRdzin created by GitHub Classroom
import java.util.Scanner;

public class Questao02 {
    
    public static void main(String[] args) {
        double d, Xa, Ya, Za, Xb, Yb, Zb;
        Scanner scan = new Scanner(System.in)
   
        System.out.println("Expresse as coordenadas de A: ");
        System.out.println("Xa: ");
        Xa = scan.nextDouble();
        System.out.println("Ya: ");
        Ya = scan.nextDouble();
        System.out.println("Za: ");
        Za = scan.nextDouble();

        System.out.println("Expresse as coordenadas de B: ");
        System.out.println("Xb: ");
        Xb = scan.nextDouble();
        System.out.println("Yb: ");
        Yb = scan.nextDouble();
        System.out.println("Zb: ");
        Zb = scan.nextDouble();

        d = Math.sqrt(Math.pow((Xb - Xa), 2) + Math.pow((Yb - Ya), 2) + Math.pow((Zb - Za), 2)); //raiz quadrada de ((Xb - Xa)**2 + (Yb - Ya)**2 + (Zb - Za)**2)
        System.out.printf("A distância entre os pontos é: %f", d);
        
    }

}
