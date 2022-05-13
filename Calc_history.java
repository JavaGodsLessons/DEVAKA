import java.util.Scanner;

public class Calc_history {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator_1 calc1 = new Calculator_1();
        calc1.a = scanner.nextDouble();
        calc1.b = scanner.nextDouble();
        double numbers1 = calc1.Add();
        System.out.println("Сложение:" + calc1.a + " + " + calc1.b + " = " + numbers1);

        Calculator_1 calc2 = new Calculator_1();
        calc2.a = scanner.nextDouble();
        calc2.b = scanner.nextDouble();
        double result2 = calc2.subtraction();
        System.out.println("Вычитание:" + calc2.a + " - " +  calc2.b + " = " + result2);

        Calculator_1 calc3 = new Calculator_1();
        calc3.a = scanner.nextDouble();
        calc3.b = scanner.nextDouble();
        double result3 = calc3.multiplication();
        System.out.println("Умножение:" + calc3.a + " * " +  calc3.b + " = " + result3);

        Calculator_1 calc4 = new Calculator_1();
        calc4.a = scanner.nextDouble();
        calc4.b = scanner.nextDouble();
        double result4 = calc4.division();
        System.out.println("Деление:" + calc4.a + " / " +  calc4.b + " = " + result4);

    }
}
class Calculator_1{
    double a;
    double b;

    double Add(){
        double numbers = a + b;
        return numbers;

    }
    double subtraction(){
        double result2 = a - b;
        return result2;
    }
    double multiplication(){
        double result3 = a * b;
        return result3;
    }
    double division(){
        double result4 = a / b;
        return result4;
    }
}
