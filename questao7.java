# lista-de-exercicios-2-KauanRdzin
lista-de-exercicios-2-KauanRdzin created by GitHub Classroom
public class questao7 {

    public static void main(String[] args) {

        /*  O código errado é o "B"
            Pois o erro era que com o "DO while" executa o codigo e depois verifica, assim o -1 era exibido, Para corrigir 
            colocamos um if dentro do "do while", com isso ele só imprimirá caso o codigo não seja -1. */

        Scanner teclado = new Scanner(System.in);
        int codigo;
 
        do {

            System.out.print("Informe o código: ");
            codigo = teclado.nextInt();
            
            if(codigo != -1){
                System.out.println("Código: " + codigo);
            }

        } while (codigo != -1);
        teclado.close();

    }

}
