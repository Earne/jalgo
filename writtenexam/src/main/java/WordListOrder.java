import java.util.Iterator;
import java.util.TreeSet;

// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class WordListOrder
 {
 //METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
 public static int canArrangeWords(String arr[])
 {
     TreeSet<Character> firsts = new TreeSet<>();
     TreeSet<Character> ends = new TreeSet<>();
  // INSERT YOUR CODE HERE
     for (int i = 0; i < arr.length; i++) {
         firsts.add(arr[i].charAt(0));
         ends.add(arr[i].charAt(arr[i].length() - 1));
     }
//     System.out.println(firsts);
//     System.out.println(ends);

     Iterator<Character> biter = firsts.iterator();
     biter.next();
     Iterator<Character> eiter = ends.iterator();
//     int i = 0;
     while (biter.hasNext()) {
         char b = biter.next();
         char e = eiter.next();

//         if (i > 0 && i < firsts.size() - 1) {
             if (b != e)
                 return -1;
//         }
     }
     return 1;
 }
// METHOD SIGNATURE ENDS

// DO NOT IMPLEMENT THE main( ) METHOD
 public static void main(String[] args)
 {
      // PLEASE DO NOT MODIFY THIS METHOD
//     String arr[]={"abcd", "defg", "ghij", "jkl"};
     String arr[]={"abc", "cde", "efg", "klm"};
     int out;
     // ASSUME INPUTS HAVE ALREADY BEEN TAKEN
     out = canArrangeWords(arr);
     System.out.println("output:");
//     System.out.println(out);
     // Print the output
 }
}