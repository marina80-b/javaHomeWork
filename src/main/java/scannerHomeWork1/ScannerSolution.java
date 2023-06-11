package scannerHomeWork1;

import java.util.Scanner;

public class ScannerSolution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter pls value for A: ");
        int a = sc.nextInt();

        System.out.println(2*Math.pow(10,2) + 4*Math.pow(10,1) + 8*Math.pow(10,0));

        System.out.println("Enter pls value for B: ");
        int b = sc.nextInt();

        System.out.println(Integer.toOctalString(b));

        System.out.println("Enter pls value for C: ");
        int c = sc.nextInt();

        System.out.println(Integer.toBinaryString(c));

        System.out.println("Enter pls value for D: ");
        int d = sc.nextInt();

        System.out.println(Integer.toHexString(a));



        sc.close();

    }

}
