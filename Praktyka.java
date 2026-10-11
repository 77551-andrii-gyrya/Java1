import java.util.Scanner;

public class Praktyka {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę naturalną: ");
        int n = sc.nextInt();

        Obliczenie(n);
    }

    public static void Obliczenie(int n){
        while (n > 1)  {
            if (n%2 == 0)
                n = n/2;
            else
                n = n * 3 + 1;
            System.out.println(n + " ");
        }

    }
}
