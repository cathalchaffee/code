// Language = java
// Cathal's work
public class Sort {
  public static void main(String[] args) {
    for(int i = 1; i<=100; i++) {
      if(i%3 == 0 && i%7 == 0) {
        System.out.println("OnBase");
      } else if(i%3 == 0) {
        System.out.println("On");
      } else if(i%7 == 0) {
        System.out.println("Base");
      } else {
        System.out.println(i);
      }
    }
    int[] myArray = {1,2,3,2,1,6,786,0,-1};
    sorter(myArray);
    for(int i = 0; i<myArray.length; i++) {
      System.out.println(myArray[i]);
    }
  }

  public static int[] sorter(int[] myArray) {
    for(int i = 0; i<myArray.length; i++) {
      for(int j=i; j>0 && myArray[j]<=myArray[j-1]; j--) {
        int temp = myArray[j-1];
        myArray[j-1] = myArray[j];
        myArray[j] = temp;
      }
    }
    return myArray;
  }
}
