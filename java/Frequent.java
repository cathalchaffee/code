import java.util.Stack;
import java.util.HashMap;

public class Frequent {
  public static void main(String[] args) {
    freqChar("thissstdhatdaaaadiidiid");
  }
  // You need to import hashmap and Stack
  public static void freqChar(String s) {
    s.toLowerCase();
    HashMap<Character, Integer> hm = new HashMap<Character, Integer>(); // for mapping frequency to character 
    Stack chars = new Stack();
    int f = 0; // frequency count
    for(int i = 0; i<s.length(); i++) {
      char curr = s.charAt(i);
      // incrament the character
      int num = 0;
      try {
        num = hm.get(curr);
        num += 1;
        hm.put(curr,num); // save to hash
      } catch (NullPointerException e) {
        num = 1;
      } // try catch
      hm.put(curr,num); // save to hash
      // set the stack to appropriate results
      if(num == f) {
        chars.push(curr);
      } else if (num > f) {
        while(!chars.empty()) {
          chars.pop();
        } //while
        chars.push(curr);
        f = num; // set the best frequency
      } // if
    } // for
    // printing the results
    while(!chars.empty()) {
      System.out.println(chars.pop());
    }
  }
}
