package numericalSystemsSolution;

public class BinarySolution {
    public static void main(String[] args) {

        int a = 248;

        // 10 -> 2
        System.out.println(248 / 2); // 124
        System.out.println(248 % 2); // 0

        System.out.println(124 / 2); // 62
        System.out.println(124 % 2); // 0

        System.out.println(62 / 2);  // 31
        System.out.println(62 % 2);  // 0

        System.out.println(31 / 2);  // 15
        System.out.println(31 % 2);  // 1

        System.out.println(15 / 2);  // 7
        System.out.println(15 % 2);  // 1

        System.out.println(7 / 2);   // 3
        System.out.println(7 % 2);   // 1

        System.out.println(3 / 2);   // 1
        System.out.println(3 % 2);   // 1

        System.out.println(1 / 2);   // 0
        System.out.println(1 % 2);   // 1

        // 11111000

        // 2 -> 10
        double result1 = 1*Math.pow(2,7) + 1*Math.pow(2,6) + 1*Math.pow(2,5) + 1*Math.pow(2,4) + 1*Math.pow(2,3) + 0*Math.pow(2,2) + 0*Math.pow(2,1) + 0*Math.pow(2,0);
        System.out.println(result1);

        // короткие пути перевода
        // 10 -> 2
        System.out.println(Integer.toBinaryString(a));

        // 2 -> 10
        int a2 = 0b11111000;
        System.out.println(a2);
    }
}
