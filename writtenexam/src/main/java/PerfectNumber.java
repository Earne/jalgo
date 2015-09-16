// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class PerfectNumber
 {
 // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
  public static int perfectNumberCheck(int n)
  {
    // Check if N is perfect or not 
    // Return 1 or 0
    // INSERT YOUR CODE HERE
      int factorSum = 0;
      for (int i = 1; i < n; i++) {
          if (n % i == 0)
              factorSum += i;
      }
     if (factorSum == n)
         return 1;
      else
         return 0;
  }
 // METHOD SIGNATURE ENDS

// DO NOT IMPLEMENT THE main( ) METHOD
  public static void main(String[] args)
  {
    // PLEASE DO NOT MODIFY THIS FUNCTION
    // YOUR FUNCTION SHALL BE AUTOMATICALLY CALLED AND THE INPUTS FROM HERE SHALL BE PASSED TO IT
    int n=10;   
    // ASSUME INPUTS HAVE ALREADY BEEN TAKEN
    System.out.println(perfectNumberCheck(n));
    // Print the output
  }
}
