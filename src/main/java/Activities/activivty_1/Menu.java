package Activities.activivty_1;

import java.util.Scanner;

public class Menu {
  public void showMenu(){
    int option = 0;

    UnidimensionalArray array = new UnidimensionalArray();

    do {

      final Scanner sc = new Scanner(System.in);

      System.out.println("\n\n*****  WELCOME ! *****\n");
      System.out.println("1. Insert numbers\n" +
          "2. Insert number only in specific position\n" +
          "3. Delete number of array\n" +
          "4. Clean array\n" +
          "5. Show array\n" +
          "6. Calculate average\n" +
          "7. Exit\n\n" +
          "Please select an option: ");
      option = sc.nextInt();

      switch (option){
        case 1 -> array.insertNumbers();
        case 2 -> array.specificPositions();
        case 3 -> array.deleteNumber();
        case 4 -> array.cleanArray();
        case 5 -> array.printArray();
        case 6 -> array.average();
        case 7 -> array.exit();
        default -> System.out.println("Please enter a number between 1 - 7");
      }
    } while (option != 7);
  }
}
