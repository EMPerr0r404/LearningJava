import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
public class KalkulatorRaty {
    public static void main(String[] args) {
        final byte ILOSC_MC_W_ROKU = 12;
        final byte PROC = 100;
        int wysokoscPozyczki = 0;
        double procentMiesieczny =0;
        double procentRoczny = 0;
        int iloscRat = 0;
        int dlugoscPozyczkiWLatach = 0;
        Scanner scanner = new Scanner(System.in);


        while (true) {
            try {
                System.out.print("Podaj wysokość pożyczki: ");
                String text = scanner.nextLine();
                wysokoscPozyczki = Integer.parseInt(text);

                if (wysokoscPozyczki >= 1000 && wysokoscPozyczki <= 1_000_000) {
                    System.out.println("Wysokość pożyczki: " + wysokoscPozyczki);
                    break;
                }
                System.out.println("Podaj wartość między 1000 a 1000000");

            } catch (NumberFormatException e) {
                System.out.println("Podaj wartość między 1000 a 1000000");
            }

        }


        while (true) {
            try {
            System.out.print("Na jaki %?: ");
            String text = scanner.nextLine();
            procentRoczny = Double.parseDouble(text);

            if (procentRoczny >= 1 && procentRoczny <= 30) {
                System.out.println("Pożyczka jest na: " + procentRoczny + "%");
                break;
            }
            System.out.println("Podaj wartość między 1 a 30");

            } catch (NumberFormatException e) {
                System.out.println("Podaj wartość między 1 a 30 do oddzielenia używaj .");
            }
        }


        while (true) {
            try {
            System.out.print("Na ile lat?: ");
                String text = scanner.nextLine();
                dlugoscPozyczkiWLatach = Integer.parseInt(text);

            if (dlugoscPozyczkiWLatach >= 1 && dlugoscPozyczkiWLatach <= 30){
            iloscRat = dlugoscPozyczkiWLatach * ILOSC_MC_W_ROKU;
            System.out.println("Okres spłaty w miesiącach: " + iloscRat);
            break;
            }
            System.out.println("Podaj wartość między 1 a 30");
            } catch (NumberFormatException e) {
                System.out.println("Podaj wartość między 1 a 30");
            }
        }

        procentMiesieczny = procentRoczny / ILOSC_MC_W_ROKU / PROC;
        double rata = wysokoscPozyczki
                * (procentMiesieczny * Math.pow(1 + procentMiesieczny, iloscRat))
                / (Math.pow(1 + procentMiesieczny, iloscRat) - 1) ;
        String rataSformatowana = NumberFormat.getCurrencyInstance().format(rata);
        System.out.print("Rata wyniesie: " + rataSformatowana);

    }
}