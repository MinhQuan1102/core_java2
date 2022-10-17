package SE1.Week3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        int[] a = {5, 10, 15, 20};
        int[] b = {5, 0, 5};
        divide(a, b);
    }

    /**
     * @overview divide method divides the values of the same index
     *          of 2 arrays a and b and save the result in another array
     * @param a
     * @param b
     * @effects
     *   if a.length < b.length
     *     throw IndexOutOfBound Exception
     *     ask user to provide the missing value for the divisors
     *   if b.length < a.length
     *     throw IndexOutOfBound Exception
     *     ask user to provide the missing value for the dividends
     *   if b contains 0
     *     throw Arithmetic exception
     *     ask user to replace the values of 0
     *   return the array of result
     */
    public static void divide(int[] a, int[] b) {
        int length = Math.max(a.length, b.length);
        int[] divisionResult = new int[length];
        int zeroDividend = 0;
        for (int i : b) {
            if (i == 0) zeroDividend++;
        }
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            try {
                divisionResult[i] = a[i] / b[i];
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Index out of bound exception. Do you want to provide the missing value? \n1.Yes \n2.No");
                int userChoice = sc.nextInt();
                switch(userChoice) {
                    case 1:
                        if (a.length < b.length) {
                            System.out.println("Please provide values for divisors");
                            int newDivisor = sc.nextInt();
                            divisionResult[i] = newDivisor / b[i];
                        } else {
                            System.out.println("Please provide values for dividends");
                            int newDividend = sc.nextInt();
                            divisionResult[i] = a[i] / newDividend;
                        }

                        break;
                    case 2:
                        break;
                }
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic exception. Do you want to replace the 0 value(s)? \n1.Yes \n2.No");
                int userChoice = sc.nextInt();
                switch(userChoice) {
                    case 1:
                        System.out.println("Please provide " + zeroDividend + " values for the value 0");
                        int newDividend = sc.nextInt();
                        divisionResult[i] = a[i] / newDividend;
                        break;
                    case 2:
                        break;
                }
            }
        }
        System.out.println(Arrays.toString(divisionResult));
    }
}
