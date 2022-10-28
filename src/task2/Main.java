package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Rectangle rec = new Rectangle();

        Scanner sd1 = new Scanner(System.in);
        rec.side1 = sd1.nextDouble();

        Scanner sd2 = new Scanner(System.in);
        rec.side2 = sd2.nextDouble();
        System.out.println("Area:" + rec.areaCalculator(rec.side1, rec.side2));
        System.out.println("Perimeter:" + rec.perimeterCalculator(rec.side1, rec.side2));

    }
}
