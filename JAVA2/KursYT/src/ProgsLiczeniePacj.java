import java.util.Scanner;

public class ProgsLiczeniePacj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        first:
        while (true) {
            outerLoop2:
            while (true) {
                int iloscSesji = 0;
                int oplata = 0;
                int sumaPacjent = 0;
                int sumaPacjentMoje = 0;
                int sumaWszyscy = 0;
                int sumaWszyscyMoje = 0;
                int oplataMoje = 0;
               int sumaPacjentGabinet =0;
               int sumaWszyscyGabinet =0;


                while (true) {

                    System.out.print("Ilosc sesji z pacjentem: ");
                    String text = scanner.nextLine();
                    iloscSesji = Integer.parseInt(text);

                    System.out.print("Opłata za sesje: ");
                    String text2 = scanner.nextLine();
                    oplata = Integer.parseInt(text2);

                    oplataMoje = switch (text2) {
                        case "180" -> 100;
                        case "160" -> 90;
                        case "150" -> 80;
                        default -> 999;
                    };
                    if (oplataMoje == 999) {
                        System.out.println("!!!BRAK ZMIENNEJ!!!");
                        System.out.println("!!!BRAK ZMIENNEJ!!!");
                        System.out.println("Musimy zacząć od początku" +"/n");
                        break outerLoop2;
                    }


                    sumaPacjent = iloscSesji * oplata;
                    sumaPacjentMoje = iloscSesji * oplataMoje;
                    sumaWszyscy += sumaPacjent;
                    sumaWszyscyMoje += sumaPacjentMoje;
                    sumaPacjentGabinet = sumaPacjent - sumaPacjentMoje;
                    sumaWszyscyGabinet += sumaPacjentGabinet;


                    System.out.println("\n" + "Suma za tego pacjenta = " + sumaPacjent);
                    System.out.println("Z tego dla mnie = " + sumaPacjentMoje);
                    System.out.println("Z tego dla gabinetu = " + sumaPacjentGabinet);
                    System.out.println("\n" + "Kolejny pacjent? t/n ");

                    while (true) {
                        String kolejny = scanner.nextLine();

                        if (kolejny.equalsIgnoreCase("n")) {
                            System.out.println("\n" + "Suma za wszystkich pacjentów = " + sumaWszyscy);
                            System.out.println("Suma dla mnie = " + sumaWszyscyMoje);
                            System.out.println("Suma dla gabinetu = " + sumaWszyscyGabinet);
                            break first;
                        } else if (!kolejny.equalsIgnoreCase("t")) {
                            System.out.println("t/n");
                        } else break;
                    }
                }
            }
        }
    }
}
