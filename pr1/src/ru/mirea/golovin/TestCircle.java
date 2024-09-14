package ru.mirea.golovin;

public class TestCircle {
        public static void main(String[] args) {
            // Создание первого круга с радиусом по умолчанию
            Circle circle1 = new Circle();
            System.out.printf("Площадь круга с радиусом %.2f равна %.2f%n",
                    circle1.getRadius(), circle1.getArea());

            // Создание второго круга с радиусом 23
            Circle circle2 = new Circle(23);
            System.out.printf("Площадь круга с радиусом %.2f равна %.2f%n",
                    circle2.getRadius(), circle2.getArea());

            // Создание третьего круга с радиусом 100
            Circle circle3 = new Circle(100);
            System.out.printf("Площадь круга с радиусом %.2f равна %.2f%n",
                    circle3.getRadius(), circle3.getArea());

            // Изменение радиуса второго круга
            circle2.setRadius(150);
            System.out.printf("Площадь круга с радиусом %.2f равна %.2f%n",
                    circle2.getRadius(), circle2.getArea());
        }
    }


