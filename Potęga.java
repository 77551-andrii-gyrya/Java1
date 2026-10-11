import java.util.Scanner;

public class Potęga {
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę całkowitą: ");
        int a = sc.nextInt();
        System.out.println("Podaj drugą liczbę całkowitą: ");
        int b = sc.nextInt();

        float result = (float)Potęga(a, b);

        System.out.println("a do potęgi b jest równa: " + result);
    }

    public static float Potęga(int a, int b){
        return (float)Math.pow(a, b);
    }
}
