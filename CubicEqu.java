import java.util.Scanner;

public class CubicEqu {
    public static void main(String[] arg){
        /// ax3 + bx2 + cx + d = 0

        Scanner sc = new Scanner(System.in);

        System.out.println("Masz formulę ax3 + bx2 + cx + d = 0");
        System.out.println("Podaj liczbę a: ");
        double A1 = sc.nextDouble();
        System.out.println("Podaj liczbę b: ");
        double B1 = sc.nextDouble();
        System.out.println("Podaj liczbę c: ");
        double C1 = sc.nextDouble();
        System.out.println("Podaj liczbę d: ");
        double D1 = sc.nextDouble();


        /// x3 + ax2 + bx + c = 0
        double a = B1/A1;
        double b = C1/A1;
        double c = D1/A1;

        /// y3 + py + q = 0

        double p = (-1)*((a*a)/3) + b;
        double q = ((2*a*a*a)/27) - ((a*b)/3) + c;
        double Q = Q(p,q);

        System.out.println("Q = " + Q);

        /// y = v + u
        double v = Math.cbrt(-(q/2) + Math.sqrt(Q));
        double u = Math.cbrt(-(q/2) - Math.sqrt(Q));

        if (A1 == 0)
        {
            throw new Error("\n\n\t\tERROR: liczba a nie musi być równa 0!!!\n");
        }
        else
        {
            if (Q > 0)
            {
                float y1_0 = (float)y1_0(v,u);
                float y2and3_part1_0 = (float)y2and3_part1_0(v,u);
                float y2and3_part2_0 = (float)y2and3_part2_0(v,u);

                System.out.println(" ");
                System.out.println("x1 = " + (y1_0 - (a/3)));
                System.out.println("x2,3 = " + (y2and3_part1_0 - (a/3)) + " ± " + y2and3_part2_0 + "i");

            }
            else if (Q == 0)
            {
                float y1_1 = (float)(2 * v);
                float y2and3_1 = (float)(-v);

                System.out.println(" ");
                System.out.println("x1 = " + (y1_1 - (a/3)));
                System.out.println("x2,3 = " + (y2and3_1 - (a/3)));
            }
            else
            {
                float rho = (float)(2 * Math.sqrt(-p/3));
                float phi = (float)Math.acos((-q/2)*Math.pow(-p/3, -1.5));

                float y1_2 = (float)(rho * Math.cos((phi + 2 * Math.PI * 0)/3));
                float y2_2 = (float)(rho * Math.cos((phi + 2 * Math.PI * 1)/3));
                float y3_2 = (float)(rho * Math.cos((phi + 2 * Math.PI * 3)/3));

                System.out.println(" ");
                System.out.println("x1 = " + (y1_2 - (a/3)));
                System.out.println("x2 = " + (y2_2 - (a/3)));
                System.out.println("x3 = " + (y3_2 - (a/3)));
            }
        }
    }

    private static double Q(double p, double q){
        return (p/3)*(p/3)*(p/3) + (q/2)*(q/2);
    }

    /// case 0: Q > 0
    private static double y1_0(double v, double u){
        return v + u;
    }
    private static double y2and3_part1_0(double v, double u){
        return - ((v+u)/2);
    }
    private static double y2and3_part2_0(double v, double u){
        return ((v-u)*Math.sqrt(3))/2;
    }

    /// case 1: Q = 0 (nie potrebue implentowania)

    /// case 2: Q < 0 (nie potrebue implentowania)
}
