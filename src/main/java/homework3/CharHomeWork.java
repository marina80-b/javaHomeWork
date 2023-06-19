package homework3;

public class CharHomeWork {
    public static void main(String[] args) {
        // создайте три переменные типа char, равные 0,
        // разработайте подход для перевода значения из char
        // в int тремя способами

        char a = '0';
        char b = 0;
        char c = '0';

        // # 1
        int d = c;
        System.out.println(d);

        // # 2
        char t2 = '0';
        String t = String.valueOf(t2);
        int tt = Integer.parseInt(t);
        System.out.println(tt);

        // # 3
        char t3 = '0';
        int e = Character.getNumericValue(t3);
        System.out.println(e);





    }
}
