public class PrimeN {
    public static void main(String[] arg){
        int a;
        for(a=101; a > 100; a++) {
            boolean czyPierwsza = true;
            if (a < 2)
                czyPierwsza = false;
            else {
                int dzielnik = 2;

                while (dzielnik * dzielnik <= a) {
                    if (a % dzielnik == 0) {
                        czyPierwsza = false;
                        break;
                    }
                    dzielnik++;
                }
            }

            if (czyPierwsza)
                System.out.println("Liczba " + a + " jest pierwsza");

        }
    }
}
