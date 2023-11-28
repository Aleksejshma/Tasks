import java.util.Scanner;

public class SolutionTasks {
    public static void main(String[] args) {

        //  Задача № 1.
        //  Найти максимальное число из трех.
        //  Определить какое из трех введенных пользователем чисел максимальное.
        //  Вывести его на экран.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите последовательно три значения переменных a, b и c.");
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        double c = sc.nextDouble();
//        if (a >= b && a >= c) {
//            System.out.println(a + " Наибольшее значение");
//        } else if (b >= a && b >= c) {
//            System.out.println(b + " Наибольшее значение");
//        } else if (c >= a && c >= b) {
//            System.out.println(c + " Наибольшее значение");
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите последовательно три значения переменных a, b и c.");
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        double c = sc.nextDouble();
//        double max;
//        if (a > b) {
//            max = a;
//        } else
//            max = b;
//        if (max > c) {
//            max = max;
//        } else max = c;
//        System.out.println(max + " Max value"); // Метод из задачи паскаля.

        //  Задача № 2
        //  Найти среднее число из трех.
        //  Среди трех чисел найти среднее.
        //  Если среди чисел есть равные, вывести сообщение "Ошибка".
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите последовательно три значения переменных a, b и c.");
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        double c = sc.nextDouble();
//        double average;
//        if ((a < b && b < c) || (a > b && b > c)) {
//            average = b;
//            System.out.println(average + " - average value");
//        } else if ((b > a && a > c) || (b < a && b < c)) {
//            average = a;
//            System.out.println(average + " - average value");
//        } else if ((a > c && c > b) || (a < c && c < b)) {
//            average = c;
//            System.out.println(average + " - average value");
//        } else System.out.println("Error, equal values were entered. Try again!");

        //  Задача № 3.
        //  Вывести нечетное число.
        //  Из двух чисел с разной четностью вывести на экран нечетное число.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите последовательно два значения переменных с разной четностью a и b - например 10 и 15");
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        if ((a % 2 != 0) && (b % 2 == 0)) {
//            System.out.println(a);
//        } else if ((b % 2 != 0) && (a % 2 == 0)) {
//            System.out.println(b);
//        } else System.out.println("Вы ввели два числа с одинаковой четностью. Повторите ввод!");

        //  Задача № 4.
        //  Проверка кратности числа
        //  Вводятся два числа (большее и меньшее).
        //  Определить, кратно ли первое число второму, то есть делится ли первое число нацело на второе.
        //  Вывести на экран сообщение об этом, а также остаток от деления, если первое число не кратно второму.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите последовательно два значения переменных - большее и меньшее a и b - например 16 и 8");
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        double result;
//        if (a == b) {
//            System.out.println("Значения были введены не верно. Повторите ввод!");
//        } else if (a < b) {
//            System.out.println("Значения были введены не верно. Повторите ввод!");
//        } else if (a == -a || b == -b) {
//            System.out.println("Значения были введены не верно. Повторите ввод!");
//        } else if (a % b == 0) {
//            System.out.println(a + " - верное значение! Число - " + a + " делится нацело на число - " + b + " без остатка.");
//        } else if (a % b != 0) {
//            result = a % b;
//            System.out.println(result + " - это остаток от деления, введенное число - " + a + " не делится нацело на - " + b);
//        }

        //  Задача № 5
        //  Вычисление значения функции.
        //  Требуется написать программу, вычисляющую значение какой-либо функции у = f(x).

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Дана конструкция функции у = f(х); Вам нужно задать несколько (три) значения х и одно значение функции f");
//        System.out.println("у = 0, если х = 0;        " +
//                " у = |х|, если х < 0;        " +
//                " у = f(x), если х > 0.");
//        System.out.println("Введите последовательно три значения переменных - х1. х2, х3, а так же значение функции f.");
//        double x1 = sc.nextDouble();
//        double x2 = sc.nextDouble();
//        double x3 = sc.nextDouble();
//        double f = sc.nextDouble();
//        double y1;
//        double y2;
//        double y3;
//        if (x1 > 0) {
//            y1 = x1 + f;
//            System.out.println("y1 = " + y1 + " , при х1 =" + x1);
//        } else if (x1 == 0) {
//            y1 = x1;
//            System.out.println("y1 = " + y1 + " , при х1 =" + x1);
//        } else if (x1 < 0) {
//            y1 = x1 * -1;
//            System.out.println("y1 = " + y1 + " , при х1 =" + x1);
//        }
//
//        if (x2 > 0) {
//            y2 = x2 * f;
//            System.out.println("y2 = " + y2 + " , при х2 =" + x2);
//        } else if (x2 == 0) {
//            y2 = x2;
//            System.out.println("y2 = " + y2 + " , при х2 =" + x2);
//        } else if (x2 < 0) {
//            y2 = x2 * -1;
//            System.out.println("y2 = " + y2 + " , при х2 =" + x2);
//        }
//
//        if (x3 > 0) {
//            y3 = Math.cos(Math.toRadians(x3));
//            System.out.println("cos y3 = " + y3  + " , при х3 =" + x3);
//        } else if (x3 == 0) {
//            y3 = x3;
//            System.out.println("y3 = " + y3 + " , при х3 =" + x3);
//        } else if (x3 < 0) {
//            y3 = x3 * -1;
//            System.out.println("y3 = " + y3 +  " , при х3 =" + x3);
//
//        }
//
//        System.out.println("Спасибо, что воспользовались нашим сервисом!");

        //  Задача № 6
        //  Определение четверти на координатной плоскости
        //  Требуется написать программу, определяющую по координатам точки, в какой четверти она находится.
        //  Координаты точки вводятся с клавиатуры.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите значения х и у, они могут быть как отрцательные, так и положительные.");
//        double x = sc.nextDouble();
//        double y = sc.nextDouble();
//        if (x > 0 && y > 0) {
//            System.out.println("Значения X = " + x + " и Y = " + y + " определяют точку в I четверти прямоугольной системы координат.");
//        } else if (x < 0 && y > 0) {
//            System.out.println("Значения X = " + x + " и Y = " + y + " определяют точку во II четверти прямоугольной системы координат.");
//        } else if (x < 0 && y < 0) {
//            System.out.println("Значения X = " + x + " и Y = " + y + " определяют точку в III четверти прямоугольной системы координат.");
//        } else if (x > 0 && y < 0) {
//            System.out.println("Значения X = " + x + " и Y = " + y + " определяют точку в IV четверти прямоугольной системы координат.");
//        } else if (x == 0 && y > 0) {
//            System.out.println("Значения X = " + x + " и Y = " + y + " определяют точку в I и II четвертях прямоугольной системы координат.");
//        } else if (x == 0 && y < 0) {
//            System.out.println("Значения X = " + x + " и Y = " + y + " определяют точку в III и IV четвертях прямоугольной системы координат.");
//        } else if (x > 0 && y == 0) {
//            System.out.println("Значения X = " + x + " и Y = " + y + " определяют точку в I и IV четвертях прямоугольной системы координат.");
//        } else if (x < 0 && y == 0) {
//            System.out.println("Значения X = " + x + " и Y = " + y + " определяют точку в II и III четвертях прямоугольной системы координат.");
//        } else System.out.println("Абсциссе и ординате были присвоены нулевые значения." +
//                " Точка не относится ни к одной четверти прямоугольной системы координат.");

        //  Задача № 7.
        //  Определить возможность существования треугольника по сторонам.
        //  Вводятся длины трех сторон предполагаемого треугольника.
        //  Определить, может ли существовать треугольник с такими сторонами.
        //  При условии что, треугольник существует только тогда, когда ни одна его сторона не превышает сумму двух других.


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите значения a, b и c они могут быть только положительные.");
//        System.out.println("Запомни! Треугольник существует только тогда, когда ни одна его сторона не превышает сумму двух других.");
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        double c = sc.nextDouble();
//
//        if ((a == 0) || (b == 0) || (c == 0)) {
//            System.out.println("Такой треугольник не может существовать, одна из его сторон равна 0.");
//        } else if ((a > b + c) || (b > a + c) || (c > a + b)) {
//            System.out.println("Треугольник не может существовать! Одна из его сторон превысила сумму двух других! Читай правило перед вводом!");
//        } else if (((a < b + c) || (b < a + c) || (c < a + b))) {
//            System.out.println("Такой треугольник может существовать");
//            if (a == b && b == c && c == a) {
//                System.out.println("У вас получился отличный равносторонний треугольник.");
//            } else if ((Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) || (Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2)) || (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2))) {
//                System.out.println("У вас получился отличный прямоугольный треугольник");
//            } else if ((a == b) || (b == c) || (c == a)) {
//                System.out.println("У вас получился отличный равнобедренный треугольник");
//            } else System.out.println("У вас получился отличный разносторонний треугольник");
//        }


        //  Задача № 8.
        //  Принадлежит ли точка кругу с центром в начале координат.
        //  С клавиатуры задаются координаты точки.
        //  Также радиус круга, центр которого находится в начале координат.
        //  Определить, принадлежит ли данная точка кругу.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите последовательно данные точки по оси х и по оси у, затем задайте радиус круга. ");
//        double x = sc.nextDouble();
//        double y = sc.nextDouble();
//        double r = sc.nextDouble();
//        double c;
//        c = Math.sqrt(Math.pow(x, 2) + (Math.pow(y, 2)));
//        if (c <= r) {
//            System.out.println("Точка с координатой х = " + x + " и координатой у = " + y + " Находится внутри круга");
//        } else
//            System.out.println("Точка с координатой х = " + x + " и координатой у = " + y + " Находится за пределами круга");

        //  Задача № 9.
        //  Вычисление площадей геометрических фигур
        //  Написать программу, которая в зависимости от выбора пользователя вычисляет площадь одной из трех геометрических фигур:
        //  Прямоугольника, треугольника или круга.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите одно из трех числовых обозначений фигур, привееденных ниже.");
//        System.out.println(" ");
//        System.out.println("Значения могут быть только положительные.");
//        System.out.println(" ");
//        System.out.println("1 - прямоугольник,  2 - треугольник, 3 - круг.");
//        int figure = sc.nextInt();
//        switch (figure) {
//            case 1:
//                System.out.println("Вы выбрали - Прямоугольник - , теперь задайте значения его сторон a и b. ");
//                Scanner pr = new Scanner(System.in);
//                double a = pr.nextDouble();
//                double b = pr.nextDouble();
//                double sPr;
//                sPr = a * b;
//                if ((a <= 0) || (b <= 0))  {
//                    System.out.println("Стороны не могут иметь отрицательные или нулевые значения, повторите попытку заново.");
//                } else System.out.println("Площадь такого прямоугольника = " + sPr);
//                break;
//            case 2:
//                System.out.println("Вы выбрали - Треугольник - , теперь задайте значения его сторон a, b и c. ");
//                Scanner tr = new Scanner(System.in);
//                double a1 = tr.nextDouble();
//                double b1 = tr.nextDouble();
//                double c1 = tr.nextDouble();
//                double poluperimetr;
//                double sTr;
//                poluperimetr = (a1 + b1 + c1) / 2;
//                sTr = Math.sqrt(poluperimetr * (poluperimetr - a1) * (poluperimetr - b1) * (poluperimetr - c1));    // Формула Герона.
//                if (a1 <= 0 || b1 <= 0 || c1 <= 0) {
//                    System.out.println("Стороны не могут иметь отрицательные или нулевые значения, повторите попытку заново.");
//                } else if ((a1 > b1 + c1) || (b1 > a1 + c1) || (c1 > a1 + b1)) {
//                    System.out.println("Треугольник с такими значениями существовать не может.");
//                } else System.out.println("Площадь такого треугольника = " + sTr);
//                break;
//            case 3:
//                System.out.println("Вы выбрали - Круг - , теперь задайте значения его радиуса r .");
//                Scanner kr = new Scanner(System.in);
//                double r = kr.nextDouble();
//                double PI = Math.PI;
//                double sKr = PI * Math.pow(r, 2);
//                if ((r < 0) ||(r == 0)) {
//                    System.out.println("Значение радиуса не может быть отрицательнм или нулевым! Повторите ввод.");
//                } else System.out.println("Площадь получившегося круга = " + sKr);
//                break;
//            default:
//                System.out.println("Введены некорректные значения.");
//                break;

        //  Задача № 10.
        //  Високосный год или нет.
        //  С клавиатуры вводится год.
        //  Программа должна определять високосный это год или нет.
        //  Вывести на экран соответствующую надпись.
        //  A также количество дней в году.


        Scanner vis = new Scanner(System.in);
        System.out.println("Введите год, чтобы проверить был ли  или будет ли он высокосным. Данные не могут быть дробными или символьными");
        double year = vis.nextInt();
        double viscosYear = year % 4;
        if (year <= 0) {
            System.out.println("Некорректный ввод данных. Дата может быть только положительным значением.");
        } else if (viscosYear == 0 && year > 2023) {
            System.out.println("Введенный год - еще не наступил, но точно будет высокосным.");
        } else if (viscosYear == 0 && year < 2023) {
            System.out.println("Введенный год уже прошел и являлся высокосным.");
        } else if (viscosYear != 0 && year < 2023) {
            System.out.println("Введенный год уже прошел и высокосным не являлся.");
        } else if (viscosYear != 0 && year > 2023) {
            System.out.println("Введенный год - еще не наступил, но высокосным точно не будет.");
        } else if (year == 2023) {
            System.out.println("Это текущий год и он высокосным не является.");
        }
    }
}
