import com.sun.source.tree.BreakTree;

import javax.lang.model.type.ErrorType;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.ErrorManager;

public class QuadraticEqu {
    public static void main(String[] arg){
        /// ax2 + bx + c = 0
        Scanner sc = new Scanner(System.in);

        System.out.println("Masz formulę ax2 + bx + c = 0");
        System.out.println("Podaj liczbę a: ");
        double a = sc.nextDouble();
        System.out.println("Podaj liczbę b: ");
        double b = sc.nextDouble();
        System.out.println("Podaj liczbę c: ");
        double c = sc.nextDouble();

        double D = Delta(a, b, c);
        System.out.println("D = " + D);

        if (a == 0)
        {
            throw new Error("\n\nERROR: liczba a nie musi być równa 0!!!\n");
        }
        else
        {
            if (D>0)
            {
                float x1_case0 = (float)X1_case0(a, b, D);
                System.out.println("x1 = " + x1_case0);

                float x2_case0 = (float)X2_case0(a, b, D);
                System.out.println("x1 = " + x2_case0);
            }
            else if (D==0)
            {
                float x_case1 = (float)X_case1(a, b);

                System.out.println("x1 = x2 = " + x_case1);
            }
            else {
                float x1_case2_part1 = (float)X1_case2_part1(a, b);
                float x1_case2_part2 = (float)X1_case2_part2(a, D);
                System.out.println("x1 = " + x1_case2_part1 + " + " + x1_case2_part2 + "i");

                float x2_case2_part1 = (float)X2_case2_part1(a, b);
                float x2_case2_part2 = (float)X2_case2_part2(a, D);

                System.out.println("x1 = " + x2_case2_part1 + " - " + (-1)*x2_case2_part2 + "i");
            }
        }


    }

    public static double Delta(double a, double b, double c){
        return b * b - (4 * a * c);
    }

    /// dla D > 0
    public static double X1_case0(double a, double b, double D){
        return ((-1)*b + Math.sqrt(D))/(2*a);
    }
    public static double X2_case0(double a, double b, double D){
        return ((-1)*b - Math.sqrt(D))/(2*a);
    }

    /// dla D = 0
    public static double X_case1(double a, double b){
        return ((-1)*b)/(2*a);
    }

    /// dla D < 0
    public  static double X1_case2_part1(double a, double b){
        return ((-1)*b)/(2*a);
    }
    public static double X1_case2_part2(double a, double D){
        return (Math.sqrt((-1)*D))/(2*a);
    }

    public  static double X2_case2_part1(double a, double b){
        return ((-1)*b)/(2*a);
    }
    public static double X2_case2_part2(double a, double D){
        return (-1)*((Math.sqrt((-1)*D))/(2*a));
    }
}
