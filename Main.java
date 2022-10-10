import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char yon;
    String adress;
    System.out.println("What is the address of the stable?");
    adress = scanner.nextLine();
    Stable stables = new Stable(adress);
    
    System.out.println("Do you wish to add a horse to the stable");
    yon = scanner.next().charAt(0);
        do{
          
      System.out.println("What is the name of the horse?");
    scanner.nextLine();
    String name = scanner.nextLine();      
    System.out.println("What is the weight of the horse?");
     double weight = scanner.nextDouble();
      System.out.println("Enter true if the horse is tame or false if it is not");
     boolean desk = scanner.nextBoolean();
          Horse horsee = new Horse(name, weight, desk);
          stables.addHorse(horsee);
System.out.println("Do you wish to add a horse to the stable");
yon = scanner.next().charAt(0);
        } while(yon != 'n'|| yon == 'y');
     stables.printArr();   
   
  }
}