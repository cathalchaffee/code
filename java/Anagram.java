// Language = java
// Cathal's work
public class Anagram {
  public static void main(String[] args) {
    System.out.println(isAnagram("ffun","nuff"));
  }

  public static boolean isAnagram(String a, String b) {
    if(a.length() != b.length()) {
      return false;
    } // if
    for(int i = 0; i<a.length(); i++) {
      for(int j = 0; j<b.length(); j++) {
        if(a.charAt(i) == b.charAt(j)) {
          b = b.substring(0,j) + b.substring(j+1);
          break;
        } //if
      } //for
    } // for
    if(b.isEmpty()) {
      return true;
    } // if
    return false;
  }
}
