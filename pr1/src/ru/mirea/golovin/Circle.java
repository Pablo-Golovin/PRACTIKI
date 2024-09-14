package ru.mirea.golovin;

public class Circle {
        private double radius; // Поле радиуса

        // Конструктор по умолчанию
        public Circle() {
            this.radius = 1; // Установка радиуса по умолчанию
        }

        // Конструктор с параметром
        public Circle(double newRadius) {
            this.radius = newRadius;
        }

        // Метод для вычисления площади
        public double getArea() {
            return Math.PI * radius * radius;
        }

        // Метод для вычисления периметра (длины окружности)
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }

        // Метод для установки радиуса
        public void setRadius(double newRadius) {
            this.radius = newRadius;
        }

        // Метод для получения текущего радиуса
        public double getRadius() {
            return this.radius;
        }
    }
