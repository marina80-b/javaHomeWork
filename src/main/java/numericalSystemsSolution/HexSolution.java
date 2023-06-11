package numericalSystemsSolution;

public class HexSolution {
    public static void main(String[] args) {

        int a = 248;
        // 10 -> 16

        System.out.println(248 / 16);  // 15
        System.out.println(248 % 16);  // 8

        System.out.println(15 / 16);  // 0
        System.out.println(15 % 16);  // 15

        // f8

        // 16 -> 10
        double result1 = 15*Math.pow(16,1) + 8*Math.pow(16,0);
        System.out.println(result1);

        // 10 -> 16
        System.out.println(Integer.toHexString(a));

        // 16 -> 10
        int a16 = 0xf8;
        System.out.println(a16);
    }
}
