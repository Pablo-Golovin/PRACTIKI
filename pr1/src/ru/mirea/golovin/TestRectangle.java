package ru.mirea.golovin;

public class TestRectangle {
        public static void main(String[] args) {

            Rectangle rect1 = new Rectangle(5,60);
            System.out.println("Квадкрат с шириной " + rect1.with + " и высотой " + rect1.height);
            System.out.println("Площадь равна " + rect1.getArea());
            System.out.println("Периметр равен " + rect1.getPerimeter());

            System.out.println("---------------------------------------");

            Rectangle rect2 = new Rectangle(3.7,50.9);
            System.out.println("Квадкрат с шириной " + rect2.with + " и высотой " + rect2.height);
            System.out.println("Площадь равна " + rect2.getArea());
            System.out.println("Периметр равен " + rect2.getPerimeter());

        }
    }
