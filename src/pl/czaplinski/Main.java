package pl.czaplinski;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int first = 10;
        int second = 5;

        System.out.print(" wynik dodawania " + first + " oraz " + second + " : ");
        System.out.println(calculator.add(first, second));
        System.out.print(" wynik odejmowania " + first + " oraz " + second + " : ");
        System.out.println(calculator.sub(first, second));
    }
}
