import java.util.Scanner;

public class Calc_history {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Нам нужно создать один калькулятор и спользовать его весь жизненный цикл программы
        // Используй конструкцию while(true) и switch/case 
        // Входные параметры: операция (может быть число или строка), первое число, второе число
        // Выход из программы по специальномы числу иди слову
        // Перед завершением программы напечатать в консоль все лперации из калькулятора
        
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

// Имя класса не должно обычно содержать специальных символов. Должен быть Calculator. Обычно каждый класс располагается в своем файле
class Calculator_1{
    // Тут не нужны эти поля класса так как поля класа используются для описания свойст и состаяния
    double a;
    double b;
    // Нужно добавить поле history.  private List<String> history = new ArrayList<>(); Это коллекция строк.
    // history отображает состояние нашего калькулятора - какие операции были произведены
    // для каждой операции добавлять запись в history. 
    // Пример на методе add. history.add("Сложение:" + a + " + " + b + " = " + result);

    // !!!! методы класса всегда с маленькой буквы !!!!
    
    // Мы должны передавать a и b как параметры метода. Касается всех методов. Пример double add(double a, double b)
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
    // добавь метод void printHistory() который будет выводить в консоль историю операций
}
