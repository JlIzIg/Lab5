import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("***Демонстрация класса Square***");
        Square a = new Square(-5);
        System.out.println("Area is " + a.getArea());
        System.out.println("Perimeter is " + a.getPerimeter());
        System.out.println("Diagonal is " + a.getDiagonal());
        System.out.println("***Демонстрация класса SquareTest***");
        Square[] arr = new Square[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Square(Math.random() * 200 - 100);
            System.out.println("" + i + " " + arr[i].toString());
        }
        SquareTest test = new SquareTest(arr);
        System.out.println(test.getMaxAreaSquare());
        System.out.println("***Демонстрация класса Prism***");
        Prism p = new Prism(4, 5);
        System.out.println(p.toString());
        System.out.println("***Демонстрация класса PrismTest***");
        Prism[] arr2 = new Prism[10];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = new Prism(Math.random() * 80 - 40, Math.random() * 200 - 100);
            System.out.println("" + i + " " + arr2[i].toString());
        }
        PrismTest p2 = new PrismTest(arr2);
        System.out.println(p2.getMaxDiagonal());

    }
}
