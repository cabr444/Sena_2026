package Activities.activivty_1;

import java.util.Scanner;

public class UnidimensionalArray {

  final Scanner sc = new Scanner(System.in);
  int array [] = new int [10];

  // Funcion para insertar numeros (1)
  public void insertNumbers() {

    //Insert data
    for (int i = 0; i < array.length; i++) {
      System.out.println("Please insert data in the position: " + (i + 1));
      array[i] = sc.nextInt();
    }

    System.out.println("Inserting numbers...");
  }

  // Funcion para ingresar numeros en posciones especificas (2)
  public void specificPositions(){
    int position;
    int number = 0;
    char flag = 'y';

    do{
      System.out.println("Please insert the position to add a number: ");
      position = sc.nextInt();
      System.out.println("Great, now insert the number in the position " + position + " :");
      number = sc.nextInt();
      array[position - 1] = number;
      System.out.println("Do you want continue? (Y / N)");
      flag = sc.next().charAt(0);
      flag = Character.toLowerCase(flag);
    } while (flag == 'y');

    System.out.println("Inserting numbers...");
  }

  // Delete number (3)
  public void deleteNumber(){
    int position;

    System.out.println("PLease enter a position to delete number: ");
    position = sc.nextInt();
    position = position - 1;

    if (position > 10 || position < 1){
      System.out.println("Please enter a position between 1 - 10");
    }
    array[position] = 0;
  }

  // Clean array (4)
  public void cleanArray (){
    for (int i = 0; i < array.length; i++) {
      array[i] = 0;
    }
    System.out.println("The Array was cleaned successfully!");
  }

  // Mostrar contenido del arreglo (5)
  public void printArray(){
    for(int i : array){
      System.out.print(i + " ");
    }
  }

  // Promedio (6)
  public void average(){
    float average;
    int add = 0;

    for (int i = 0; i < array.length; i++) {
      add += array[i];
    }

    average = (float) add / array.length;
    System.out.println("Average of the numbers is: " + average);
  }

  // Exit
  public void exit(){
    System.out.println("Good Bye...");
  }
}
