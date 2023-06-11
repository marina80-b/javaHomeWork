package numericalSystemsSolution;

public class OctaSolution {
    public static void main(String[] args) {
        int a = 248;

        // 10 -> 8
        System.out.println(248 / 8);       // 31
        System.out.println(248 % 8);    // 0

        System.out.println(31 / 8);        // 3
        System.out.println(31 % 8);     // 7

        System.out.println(3 / 8);         // 0
        System.out.println(3 % 8);      // 3

        // 370 - в восьмеричной системе
        // 8 -> 10
        double result1 = 3* Math.pow(8,2) + 7* Math.pow(8,1) + 0* Math.pow(8,0);
        System.out.println(result1);

        // короткие пути перевода
        // 10 -> 8
        System.out.println(Integer.toOctalString(a));

        // 8 -> 10
        int a8 = 0370;
        System.out.println(a8);
    }
}
