import java.util.Scanner;
import java.util.ArrayList;

public class LargestPrimeFactor {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    long num = s.nextLong();
    LargestPrimeFactor lpf = new LargestPrimeFactor();
    boolean odd = lpf.isOdd(num); // Is the number odd?
    // initial case
    boolean numPrime = false;
    if(odd) {
      numPrime = lpf.isPrime(num);
    }
    
    if(numPrime)
      System.out.printf("the largest prime factor of %d is itself\n", num);
    else {
      long thePrime = lpf.largestPrime(num); // find the largest prime
      if(thePrime == 0) {        
        thePrime = lpf.oneOrTwo(num);
      }
      System.out.printf("the largest prime factor of %d is %d\n", num, thePrime);
    }
  }
  
  /****************************************
  * returns largest prime other than 1 or 2
  *****************************************
  */
  public long largestPrime(long num) {
    for(long i = 2; i<=num/2; i++) {
      if(num%i==0) {
        long possNum = num/i;
        if(isOdd(possNum)) {
          if(isPrime(possNum)) {
            return possNum;
          } 
        }
      }
    }
    return 0;
  }
  /************************
  * Checks a numbers oddity
  *************************
  */
  public boolean isOdd(long num) {
    if(num%2 !=0)
      return true;
    else
      return false;
  }
  
  /*************************************************
  * Checks if a number is prime. (num should be odd)
  **************************************************
  */
  public boolean isPrime(long num) {
    for(long i = 3; i <= num/3; i=i+2) {
      if(num%i == 0)
        return false;
    }
    return true;
  }
  /*************************************************
  * Checks if num is divisible by two. Else return 1
  **************************************************
  */
  public long oneOrTwo(long num) {
    if(num%2==0)
      return 2;
    else
      return 1;
  }

}
