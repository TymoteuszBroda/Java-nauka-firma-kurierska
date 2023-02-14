import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("System wspomagania firmy kurierskiej\n\n\n\n ");
        Scanner scanner = new Scanner(System.in);
        List<Kurier> kurierzy= new ArrayList<Kurier>();
        int choice;
        do {
            System.out.println("Wybierz opcję:");
            System.out.println("1. Wyświetl kurierów");
            System.out.println("2. Przypisz kuriera do klienta");
            System.out.println("3. Usuń rekord Klienta");
            System.out.println("4. Dodaj kuriera");
            System.out.println("5. Dodaj klienta");
            System.out.println("6. Wyjdź z programu");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Wyświetlenie listy wszystkich kurierów: ");
                    for (int i = 0; i<kurierzy.size(); i++)
                    {
                        System.out.println(kurierzy.get(i));
                    }
                    break;
                case 2:
                    System.out.println("Przypisanie kuriera do klienta: ");
                    break;
                case 3:
                    System.out.println("Usunięcie rekordu klienta: ");
                    break;
                case 4:
                    System.out.println("Dodawanie nowych kurierów: ");

                    break;
                case 5:
                    System.out.println("Dodanie nowych klientów: ");
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Nieprawidłowa opcja. Wybierz ponownie.");
            }
        } while (choice != 6);
    }
}