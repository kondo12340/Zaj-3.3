

public class Main {
  public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);
            char znak;

            while (true) {
                // Pobierz znak od użytkownika
                System.out.print("Wpisz znak (aby zakończyć naciśnij 'q'): ");
                znak = scanner.next().charAt(0);  // Wczytuje pojedynczy znak

                // Sprawdź, czy użytkownik wpisał 'q'
                if (znak == 'q') {
                    System.out.println("Zakończono program.");
                    break;  // Przerywa pętlę
                }

                // Wypisz wpisany znak
                System.out.println("Wpisany znak: " + znak);
            }

            scanner.close();  // Zamknięcie zasobu scanner
        }
    }