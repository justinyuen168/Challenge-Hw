import java.util.Scanner;

class challenge2 {
 public static void main(String[] args) {
     int n1 = 1;
     int n2 = 2;
     int n3 = 3;
     int total = 2;
     while (n3<4000000 ) {
         n3 = n1 + n2;
     if( n3%2 == 0) {
        total = total + n3; 
        }
        n1 = n2;
        n2 = n3;
    }
    System.out.println("the answer is " + total);
    }
}