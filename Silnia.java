import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Silnia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę nieujemną : ");
        int num = sc.nextInt();
        if (num < 0)
        {
            throw new Error("\n\n\t\tERROR: Została wpisana niepoprawna liczba! Liczba musi być nieujemną!\n");
        }

        // n! = (n-0) * (n-1) * (n-2) * ... * 3 * 2 * 1
        int result = num;
        if (num == 0)
            result = 1;
        else
            for (int i=1; i < num; i++)
            {
                result = result * (num - i);
            }

        System.out.println("n! = " + result);
    }
}