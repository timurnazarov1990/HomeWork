public class HomeWork1 {

    // 1. Создаем метод main
    public static void main(String[] args) {
        //2. Создаем и инициализурем переменные
        byte aByte = 127;
        short aShort = 5;
        int aInt = 10;
        long aLong = 20L;
        float aFloat = 12.1f;
        double aDouble = 10.1;
        char aChar = 'C';
        boolean aBoolean;
        System.out.println(calculate(1.1f, 2.2f, 3.3f, 4.4f));
        System.out.println(inInterval(4, 6));
        printIsPositiveNumber(1);
        isNegativeNumber(-1);
        printHelloForName("Ivan");


    }

    //3. метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – аргументы этого метода, имеющие тип float.
    public static float calculate(float a, float b, float c, float d) {

        return a * (b + (c / d));
    }

    //    4. Написать метод, принимающий на вход два числа, и проверяющий что
    //    их сумма лежит в пределах от 10 до 20(включительно),
    //    если да – вернуть true, в противном случае – false;
    public static boolean inInterval(int a, int b) {
        return (a + b >= 10) && (a + b <= 20);
    }

    //    5. Написать метод, которому в качестве параметра передается целое число,
//    метод должен напечатать в консоль положительное ли число передали,
//    или отрицательное; Замечание: ноль считаем положительным числом.
    public static void printIsPositiveNumber(int n) {
        if (n >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }
    //    6. Написать метод, которому в качестве параметра передается целое число,
//    метод должен вернуть true, если число отрицательное;
    public static boolean isNegativeNumber(int n) {
        if (n < 0) {
            return true;
        }
        return false;
    }
    //    7. Написать метод, которому в качестве параметра передается строка,
//    обозначающая имя, метод должен вывести в консоль сообщение «Привет,
//    указанное_имя!»;
    public static void printHelloForName(String name) {
        System.out.println("Привет, " + name + "!");
    }
}







