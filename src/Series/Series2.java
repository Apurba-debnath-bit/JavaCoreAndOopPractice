
package Series;

import java.util.Scanner;


public class Series2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the last number: ");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i= i+2) {
            System.out.println(i);
            sum = sum+i;
        }
        System.out.println("Total: " + sum);
   }
 
}
