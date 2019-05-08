// Case 2 - System kredytowy - Sebastian Muraszewski (C) 2018

package CaseSM;

import java.util.Scanner;

public class CreditSystem {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Dzień dobry!");
    System.out.println("\nNa jaką kwotę chce Pani/Pan uzyskać kredyt? Można wziąć kredyt na kwotę od 1 000 zł do 120 000 zł.");
    double price = scanner.nextDouble();
    price_range(price);

    System.out.println("A na ile rat chce Pani/Pan wziąć kredyt? Proszę podać liczbę miesięcy (od 6 do 120):");
    int installment_nr = scanner.nextInt();
    installment_range(installment_nr);

    double complete_sum = credit_sum(price);
    String insurance_agree = insurance_agree(price, complete_sum);


    System.out.println("\nCałkowita kwota do spłaty to: " + Math.ceil((complete_sum)*100)/100 + " zł.");

    System.out.println("Czy zgadza się Pani/Pan na podane warunki kredytu? Proszę napisać tak lub nie.");
    String credit_agree = scanner.next();

    if (credit_agree.equalsIgnoreCase("nie")) {
      System.out.println("\nSpecjalnie dla Pani/Pana zmniejszyliśmy potencjalną kwotę spłaty. Oferta trwa tylko przez 15 minut.");
      complete_sum = complete_sum * 0.9999;
      System.out.println("Pani/Pana nowa kwota do spłaty wynosi " + Math.ceil((complete_sum)*100)/100 + " zł.");

      System.out.println("\nZgadza się Pani/Pan na powyższe warunki? Jeśli nie, proszę napisać 'nie', co zakończy działanie systemu.");
      String disagree = scanner.next();

      if (disagree.equalsIgnoreCase("nie")) {
        System.out.println("Rezygnuje Pani/Pan z wzięcia kredytu. Życzymy miłego dnia");
      }

    }

    int ps[] = new int [9];
    CreditAbility klient1 = new CreditAbility(ps); //tablica scoringowa jako nowy obiekt

    klient1.intro();
    klient1.salary_points();
    klient1.job_points();
    klient1.apartment_status();
    klient1.family_status();
    klient1.apartment_time();
    klient1.employment_time();
    klient1.position_time();
    klient1.people_on_livelihood();
    klient1.debt();

    refusal(klient1.total_points(ps));
    summary(price, installment_nr, complete_sum, insurance_agree);
    delivery();
    System.out.println("Dziękujemy za wzięcie kredytu. Życzymy miłego dnia.");

  }

  public static void price_range(double pr) { //metoda odpowiadająca za sprawdzenie przedziału wartości kredytu
    if (pr < 1000 || pr > 120000) {
      System.out.println("Nie można wziąć kredytu na podaną kwotę. Proszę podać dane ponownie, stosując się do instrukcji.");
      System.exit(0); //wyłączenie programu
    }
  }

  public static void installment_range(int inst) { //metoda odpowiadająca za sprawdzenie, czy klient podał właściwą liczbę rat
    if (inst < 6 || inst > 120) {
      System.out.println("Nie można wziąć kredytu na określoną liczbę rat. Proszę podać dane ponownie, stosując się do instrukcji.");
      System.exit(0); //wyłączenie programu
    }
  }

  public static double credit_sum(double p) { //metoda licząca całkowitą kwotę do spłaty
    double interest_range = 1.07;
    int provision = 50;
    int control_payment = 20;
    double insurance = 1.05;

    Scanner scanner = new Scanner(System.in);

    System.out.println("\nCzy chce Pani/Pan wziąć dodatkowo płatne ubezpieczenie w wysokości 5% pożądanej kwoty?");
    System.out.println("Jeśli się Pani/Pan zgadza, proszę napisać tak.");
    String insurance_agree = scanner.nextLine();

    if (insurance_agree.equalsIgnoreCase("tak")) {
      return p * insurance * interest_range + provision + control_payment;
    } else {
      return p * interest_range + provision + control_payment;
    }

  }

  public static String insurance_agree(double pr, double cs){ //metoda, która sprawdza, czy użytkownik zgodził się na wzięcie ubezpieczenia
    if ((pr * 1.05 * 1.07 + 70) == cs){
      return "Y";
    }
    else {
      return "N";
    }
  }


  public static void refusal(int number) { //metoda sprawdzająca przyznanie zdolności kredytowej i wyświetlająca komunikat w przypadku jej nieuzyskania
    if (number < 200) {
      System.out.println("Nie ma Pani/Pan zdolności kredytowej do wzięcia zobowiązania. Zapraszamy w przyszłości.");
      System.exit(0); //wyłączenie programu
    }
  }

  public static void summary(double money, int insnr, double complete, String agr){ //metoda wyświetlająca wszystkie informacje o wziętym kredycie
    System.out.println("\nPani/Pana wniosek został pozytywnie rozpatrzony:");
    System.out.println("Oto jego podsumowanie:");
    System.out.println("Żądana kwota: " + money + " zł.");
    System.out.println("Liczba rat: " + insnr + ".");
    System.out.println("Całkowita kwota do spłaty: " + Math.ceil((complete)*100)/100 + " zł:");
    System.out.println("z czego suma odsetek wynosi: " + Math.ceil((0.07 * money)*100)/100 + " zł, ");
    System.out.println("koszt prowizji za udzielenie kredytu wynosi 50 złotych, a za rozpatrzenie wniosku 20 złotych.");

    if (agr == "Y"){ //sprawdzenie, czy klient wziął ubezpieczenie
      System.out.println("Dodatkowo ubezpieczenie kredytu wyniosło " + Math.ceil((0.05 * money)*100)/100+ " zł." );
    }

  }

  public static void delivery(){ //metoda odpowiadająca za wybranie sposobu odbioru pieniędzy
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nJak woli Pani/Pan odebrać pieniądze?");
    System.out.println("Jeśli przelewem na konto w innym oddziale, proszę wpisać 1.");
    System.out.println("Jeśli w gotówce w oddziale, proszę wpisać 2.");
    int deliv = scanner.nextInt();

    switch (deliv) {
      case 1:
        System.out.println("Proszę o podanie numeru konta bankowego.");
        String account = scanner.next(); //String ze względu na długość numeru i fakt, że jest wykorzystywany wyłącznie jako ciąg tekstowy.
        break;
      case 2:
        System.out.println("Proszę o podanie adresu oddziału, w którym Pani/Pan chce odebrać pieniądze.");
        String address = scanner.next();
        break;
      default:
        System.out.println("Nie wybrano sposobu odbioru pieniędzy.");
    }

  }


}
