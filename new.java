import java.io.*;
class Main {

  public static void main(String args[]) {

    // Creating arrays
    int array[], a[], b[];
    array = new int[10];
    a = new int[5];
    b = new int[5];

    // Giving initial values to array, and printing
    System.out.print("array: " );
    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random()*10);
      System.out.print("\t" + array[i]);
    }
    System.out.println();


    // Splitting the array in two
    for (int i = 0; i < 5; i++) {
      a[i] = array[2 * i];
      b[i] = array[2 * i + 1];
    }

    // Printing a
    System.out.print("a : " );
    for (int i = 0; i < a.length; i++) {
      System.out.print("\t" + a[i]);
    }
    System.out.println();

    // Printing b
    System.out.print("b : " );
    for (int i = 0; i < b.length; i++) {
      System.out.print("\t" + b[i]);
    }
    System.out.println();
  }
}
