package SE1.Week3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        int[] a = {5, 10, 15, 20, 25};
        int[] b = {5, 5, 0};
        divide(a, b);
    }

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
                if (i >= a.length || i >= b.length) {
                    throw new MissingValueException();
                }
                if (b[i] == 0) {
                    throw new ZeroDivisionException();
                }
                divisionResult[i] = a[i] / b[i];
            } catch (MissingValueException e) {
                System.out.println(printinfo("IndexOutOfBound"));
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
            } catch (ZeroDivisionException e) {
                System.out.println(printinfo("Arithmetic"));
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

    private static String printinfo (String errorType) {
        switch (errorType) {
            case "IndexOutOfBound":
                return "Index out of bound exception. Do you want to provide the missing value? \n1.Yes \n2.No";
            case "Arithmetic":
                return "Zero dividend. Do you want to replace the 0 value(s)? \n1.Yes \n2.No";
            default:
                return "";
        }
    }
}
