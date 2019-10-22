import java.util.Scanner;

class challenge3 {
 public static void main(String[] args) {
    
    int n = 1;
    int sum = 0;
    int total = 0;
     while (n<=100 ) {
   sum = sum + n;
   total = total + n*n;

   n++;
}
    System.out.println("the answer is " + (sum*sum - total));
    }
}
