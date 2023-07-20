package pizza.solution;

public class Pizza {
    public static void main(String[] args) {

        int pizzadiameter1 = 24;
        int pizzadiameter2 = 28;
        int kcalpersqcm = 40;

        System.out.println(Pizza(pizzadiameter1, pizzadiameter2, kcalpersqcm));

    }

    public static double Pizza( int pizzadiameter1, int pizzadiameter2, int kcalpersqcm) {

        double radius1 = pizzadiameter1 / 2;
        double radius2 = pizzadiameter2 / 2;
        double Area1 = Math.PI * (radius1 * radius1);
        double Area2 = Math.PI * (radius2 * radius2);
        double Calories1 = Area1 * kcalpersqcm;
        double Calories2 = Area2 * kcalpersqcm;
        double ExtraCalories = Calories2 - Calories1;
        return  ExtraCalories;

    }
}
