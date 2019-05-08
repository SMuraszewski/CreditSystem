package CaseSM;

import java.util.Scanner;

public class CreditAbility {

  public int credit_score[] = new int[9];

  public CreditAbility(int[] sum) {
    this.credit_score = sum;
  }

  public int[] getSum() {
    return credit_score;
  }

  public void intro(){
    System.out.println("\nPrzed wzięciem kredytu musi Pani/Pan podać kilka informacji o sobie.");
  }

  public int salary_points(){ //sprawdzanie wysokości wynagrodzenia (wybieranie opcji za pomocą switch.. case)
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nJak wysokie jest Pani/Pana wynagrodzenie netto?");
    System.out.println("Proszę wcisnąć klawisz odpowiadający numerowi pojawiającemu się obok opcji.");
    System.out.println("\n1 - do 2500 zł; 2 - między 2501 do 5000 zł; 3 - od 5001 do 10000 zł; 4 - ponad 10000 zł.");
    int salary = scanner.nextInt();

    switch (salary) {
      case 1:
        credit_score[0] = 30;
        break;
      case 2:
        credit_score[0] = 45;
        break;
      case 3:
        credit_score[0] = 61;
        break;
      case 4:
        credit_score[0] = 98;
        break;
      default:
        System.out.println("Wprowadzono błędne dane");
    }

    return credit_score[0];
  }

  public int job_points(){ //sprawdzanie zawodu bądź charakteru pracy klienta (wybieranie opcji za pomocą switch.. case)
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nJaki jest Pani/Pana zawód bądź charakter pracy?");
    System.out.println("Proszę wcisnąć klawisz odpowiadający numerowi pojawiającemu się obok opcji.");
    System.out.println("\n1 - profesjonalista lub członek kadry kierowniczej; 2 - pracownik biurowy; 3 - robotnik wykwalifikowany;");
    System.out.println("4 - student; 5 - robotnik niewykwalifikowany; 6 - osoba pracująca w niepełnym wymiarze czasu.");
    int job = scanner.nextInt();

    switch (job) {
      case 1:
        credit_score[1] = 60;
        break;
      case 2:
        credit_score[1] = 47;
        break;
      case 3:
        credit_score[1] = 45;
        break;
      case 4:
        credit_score[1] = 24;
        break;
      case 5:
        credit_score[1] = 10;
        break;
      case 6:
        credit_score[1] = 7;
        break;
      default:
        System.out.println("Wprowadzono błędne dane.");
    }

    return credit_score[1];
  }


  public int apartment_status(){ //sprawdzanie statusu mieszkania klienta (wybieranie opcji za pomocą switch.. case)
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nJaki jest status Pani/Pana mieszkania?");
    System.out.println("Proszę wcisnąć odpowiadający numerowi pojawiającemu się obok opcji.");
    System.out.println("\n1 - własne; 2 - z rodzicami; 3 - służbowe; 4 - kwaterunkowe; 5 - wynajmowane; 6 - lokatorskie.");
    int apartment = scanner.nextInt();

    switch (apartment) {
      case 1:
        credit_score[2] = 51;
        break;
      case 2:
        credit_score[2] = 25;
        break;
      case 3:
        credit_score[2] = 23;
        break;
      case 4:
        credit_score[2] = 21;
        break;
      case 5:
        credit_score[2] = 10;
        break;
      case 6:
        credit_score[2] = 3;
        break;
      default:
        System.out.println("Wprowadzono błędne dane.");
    }

    return credit_score[2];
  }

  public int family_status(){ //sprawdzanie sytuacji rodzinnej klienta (wybieranie opcji za pomocą switch.. case)
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nJaka jest Pani/Pana sytuacja rodzinna?");
    System.out.println("Proszę wcisnąć klawisz odpowiadający numerowi pojawiającemu się obok opcji.");
    System.out.println("\n1 - panna/kawaler; 2 - zamężna/żonaty; 3 - rozwiedziona/w separacji; 4 - wdowa/wdowiec.");
    int family = scanner.nextInt();

    switch (family) {
      case 1:
        credit_score[3] = 3;
        break;
      case 2:
        credit_score[3] = 4;
        break;
      case 3:
        credit_score[3] = 0;
        break;
      case 4:
        credit_score[3] = 2;
        break;
      default:
        System.out.println("Wprowadzono błędne dane.");
    }

    return credit_score[3];
  }
  
  public int apartment_time(){ //sprawdzanie okresu zamieszkania klienta pod danym adresem (wybieranie opcji za pomocą switch.. case)
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nJak długo Pani/Pan mieszka pod obecnym adresem?");
    System.out.println("Proszę wcisnąć klawisz odpowiadający numerowi pojawiającemu się obok opcji.");
    System.out.println("\n1 - krócej niż rok; 2 - od roku do dwóch lat i 6 miesięcy;"); 
    System.out.println("3 - od dwóch lat i 6 miesięcy do pięciu lat; 4 - dłużej niż 5 lat.");
    int aptime = scanner.nextInt();

    switch (aptime) {
      case 1:
        credit_score[4] = 37;
        break;
      case 2:
        credit_score[4] = 51;
        break;
      case 3:
        credit_score[4] = 66;
        break;
      case 4:
        credit_score[4] = 79;
        break;
      default:
        System.out.println("Wprowadzono błędne dane.");
    }

    return credit_score[4];
  }

  public int employment_time(){ //sprawdzanie okresu zatrudnienia klienta w obecnym miejscu pracy (wybieranie opcji za pomocą switch.. case)
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nJak długo Pani/Pan pracuje w obecnej firmie?");
    System.out.println("Proszę wcisnąć klawisz odpowiadający numerowi pojawiającemu się obok opcji.");
    System.out.println("\n1 - krócej niż pół roku; 2 - od pół roku do trzech lat; 3 - więcej niż trzy lata."); 
    int emptime = scanner.nextInt();

    switch (emptime) {
      case 1:
        credit_score[5] = 30;
        break;
      case 2:
        credit_score[5] = 34;
        break;
      case 3:
        credit_score[5] = 38;
        break;
      default:
        System.out.println("Wprowadzono błędne dane.");
    }

    return credit_score[5];
  }

  public int position_time(){ //sprawdzanie okresu zatrudnienia klienta w obecnym miejscu pracy (wybieranie opcji za pomocą switch.. case)
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nJak długo Pani/Pan pracuje na obecnym stanowisku?");
    System.out.println("Proszę wcisnąć klawisz odpowiadający numerowi pojawiającemu się obok opcji.");
    System.out.println("\n1 - rok lub krócej; 2 - dłużej niż rok."); 
    int emptime = scanner.nextInt();

    switch (emptime) {
      case 1:
        credit_score[6] = 2;
        break;
      case 2:
        credit_score[6] = 5;
        break;
      default:
        System.out.println("Wprowadzono błędne dane.");
    }

    return credit_score[6];
  }

  public int people_on_livelihood(){ //liczba osób na utrzymaniu (wybieranie opcji za pomocą switch.. case)
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nIle osób ma Pani/Pan na utrzymaniu?");
    System.out.println("Proszę wcisnąć odpowiadający numerowi pojawiającemu się obok opcji.");
    System.out.println("\n0 - zero; 1 - jedną; 2 - dwie; 3 - trzy; 4 - cztery lub więcej.");
    int pl = scanner.nextInt();

    switch (pl) {
      case 0:
        credit_score[7] = 5;
        break;
      case 1:
        credit_score[7] = 4;
        break;
      case 2:
        credit_score[7] = 3;
        break;
      case 3:
        credit_score[7] = 1;
        break;
      case 4:
        credit_score[7] = 0;
        break;
      default:
        System.out.println("Wprowadzono błędne dane.");
    }

    return credit_score[7];
  }

  public int debt(){ //sprawdzenie stanu zadłużenia klienta (wybieranie opcji za pomocą switch.. case)
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nJakie jest Pani/Pana obecne zadłużenie?");
    System.out.println("Proszę wcisnąć odpowiadający numerowi pojawiającemu się obok opcji.");
    System.out.println("\n1 - do 1000 zł; 2 - od 1000 zł do 10000 zł; 3 - od 10001 zł do 30000 zł"); 
    System.out.println("3 - trzy; 4 - cztery lub więcej.");
    int db = scanner.nextInt();

    switch (db) {
      case 1:
        credit_score[8] = 0;
        break;
      case 2:
        credit_score[8] = -30;
        break;
      case 3:
        credit_score[8] = -44;
        break;
      case 4:
        credit_score[8] = -70;
        break;
      case 5:
        credit_score[8] = -90;
        break;
      default:
        System.out.println("Wprowadzono błędne dane.");
    }

    return credit_score[8];
  }


  public int total_points(int[] sum){ //podliczenie wszystkich punktów
    int points = 0;
    for(int p : sum){
      points += p;
    }

    return points;

  }
}
