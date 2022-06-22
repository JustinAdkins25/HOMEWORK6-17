import java.util.Scanner;
public class Problem3{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);



       System.out.println("Enter a number: ");
             int n = scan.nextInt();

             int sum = 0;
             int m;

            // System.out.println("the sum of " + x + " digits is = ");
            for(int i = 0; i <= n; ){
                sum += i%10;
             }
             System.out.println( sum );
             }








    }

