package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int i, j;
	    boolean isPrime = true;

	    for (i = 2; i <= 100; i++) {
	      int sqrt = (int) Math.sqrt(i);
	      for (j = 2; j <= sqrt; j++) {
	        if (i % j == 0) {
	          isPrime = false;
	          break;
	        }
	      }
	      if (isPrime) System.out.print(" " + i + " ");
	      isPrime = true;
	
	    }
	
	}
}




