import java.util.Scanner;

class Main {

    public static double calculate_area_of_square(double a) {
        return a * a;
    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of side of a square:");
        double a = in .nextDouble();

        System.out.println("Output: Area is ");
        System.out.println(calculate_area_of_square(a));
    }
}
