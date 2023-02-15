import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("System wspomagania firmy kurierskiej\n\n\n\n ");
        Scanner scanner = new Scanner(System.in);
        List<Kurier> kurierzy= new ArrayList<Kurier>();
        List<Klient> klienci = new ArrayList<Klient>();
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
                    if (kurierzy.size()==0)
                    {
                        System.out.println("Brak kurierów do wyświetlenia!");
                    }else{
                    for (int i = 0; i<kurierzy.size(); i++)
                    {
                        System.out.println("Imie: "+kurierzy.get(i).getImie());
                        System.out.println("Nazwisko: "+kurierzy.get(i).getNazwisko());
                        System.out.println("ID: "+kurierzy.get(i).getId());
                        if (kurierzy.get(i).isWolny())
                        {
                            System.out.println("Kurier jest wolny, możesz przypisać klienta.\n\n");
                        }else {
                            System.out.println("Kurier jest zajęty, nie możesz przypisać do niego klienta.\n\n");
                        }
                    }
                    }
                    break;
                case 2:
                    System.out.println("Przypisanie kuriera do klienta: ");
                    break;
                case 3:
                    System.out.println("Usunięcie rekordu klienta: ");
                    System.out.println("Którego klienta chcesz usunąć?");
                    System.out.println("Imie: ");
                    String imieKlienta = scanner.next();
                    System.out.println("Nazwisko: ");
                    String nazwiskoKlienta = scanner.next();
                    for (int i = 0; i<klienci.size(); i++)
                    {
                        if (klienci.contains(imieKlienta)&&klienci.contains(nazwiskoKlienta))
                        {
                            klienci.remove(i);
                        }
                    }

                    break;
                case 4:
                    System.out.println("Dodawanie nowych kurierów: ");
                    System.out.println("Ilu kurierów chcesz dodać?: ");
                    int iluKurierow;
                    iluKurierow = scanner.nextInt();
                    for (int i = 0; i<iluKurierow; i++)
                    {
                        System.out.println("Imie: ");
                        String imie = scanner.next();
                        System.out.println("Nazwisko: ");
                        String nazwisko = scanner.next();
                        System.out.println("ID: ");
                        int id = scanner.nextInt();
//                        Kurier kurier = new Kurier(imie, nazwisko, id, true);
                        kurierzy.add(new Kurier(imie, nazwisko, id ,true));
                    }
                    break;
                case 5:
                    System.out.println("Dodanie nowych klientów: ");
                    System.out.println("Ilu klientów chcesz dodać?: ");
                    int iluKlientow;
                    iluKlientow = scanner.nextInt();
                    for (int i = 0; i<iluKlientow; i++)
                    {
                        System.out.println("Imie: ");
                        String imie = scanner.next();
                        System.out.println("Nazwisko: ");
                        String nazwisko = scanner.next();
                        System.out.println("Miasto: ");
                        String miasto = scanner.next();
                        System.out.println("Ulica: ");
                        String ulica = scanner.next();
                        System.out.println("Numer domu: ");
                        int numerDomu = scanner.nextInt();
                        int id = scanner.nextInt();
                        klienci.add(new Klient(imie, nazwisko, miasto, ulica, numerDomu));
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Nieprawidłowa opcja. Wybierz ponownie.");
            }
        } while (choice != 6);
    }
}