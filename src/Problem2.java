import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;



        System.out.println("Enter a positive number: ");
        n = scan.nextInt();
        int sum = 0;
        int count = 0;

        while(count <= n) {
            count++;


            if (count % 2 == 0) {

                sum += count;


            }

        }

        System.out.println("The sum of all the even number from 1 to " + n + " = " + sum);









            }

        }






