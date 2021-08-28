# lista-de-exercicios-2-KauanRdzin
lista-de-exercicios-2-KauanRdzin created by GitHub Classroom
 
 public class questao8 {
 
 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, F0 = 0, F1 = 1, Fn = 0;

        System.out.printf("Digite um número que não seja negativo: ");
        n = scan.nextInt();
        
        if(n < 0){
            System.out.println("ERRO!! Número Não Validado!");
        }else{
            System.out.printf("0, 1, ");
            for(int i = 1; i < n; i++){
                Fn = F1 + F0;
                if (i == n-1) {
                    System.out.printf("%d", Fn);
                }else{
                    System.out.printf("%d, ", Fn);
                }
                F0 = F1;
                F1 = Fn;
            }
        }
        scan.close();

    }

