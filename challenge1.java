import java.util.Scanner;

class challenge1 {
     
 public static void main(String[] args) {
    int n = 0;
    int total = 0;
     while (n<1000) {
     if( n%5 == 0 || n%3 == 0) {
         total = total + n;
        }
        n++;
      
    }
    System.out.println("the answer is " + total);
    }
}