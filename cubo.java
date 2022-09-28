import java.util.Scanner;
public class cubo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.nextLine();
        int b = scanner.nextInt();
        scanner.nextLine(); 
        
        scanner.close();

        double da = (double)a;
        double db = (double)b;

        int qtd = 0;

        double sqrt = 0;
        double cbrt = 0;

        for(double i = da; i <= db; i++){

            sqrt = Math.sqrt(i);
            cbrt = Math.cbrt(i);



            if(sqrt * sqrt == i && cbrt * cbrt * cbrt == i){
                System.out.println(sqrt);
                System.out.println(cbrt);
                System.out.println(sqrt * sqrt);
                System.out.println(cbrt * cbrt * cbrt);
                System.out.println(i);
                qtd += 1;
            }
        }

        System.out.println(qtd);
    }    
}