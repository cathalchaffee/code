import java.util.Scanner;
import java.util.ArrayList;

public class Prime {
  public static void main(String[] args) {
    printPrimes();
  }
  

  

  public static void printPrimes() {
    System.out.println("1\n2\n3");
    for(int i=5; i<100; i=i+2) {
      boolean p = true;
      for(int j = 3; j <= i/3; j=j+2) {
        if(i%j == 0) {
          p = false;
          break;
        }
      }
      if(p == true)
        System.out.println(i);
    }
  }
}
