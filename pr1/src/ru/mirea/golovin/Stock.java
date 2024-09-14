package ru.mirea.golovin;

public class Stock {
        private String symbol; // Символ акции
        private String name; // Название компании
        private double previousClosingPrice; // Предыдущая цена закрытия
        private double currentPrice; // Текущая цена

        // Конструктор класса Stock
        public Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
            this.symbol = symbol;
            this.name = name;
            this.previousClosingPrice = previousClosingPrice;
            this.currentPrice = currentPrice;
        }

        // Метод для вычисления изменения в процентах
        public double getChangePercent() {
            if (previousClosingPrice == 0) {
                throw new IllegalArgumentException("Предыдущая цена закрытия не может быть нулевой.");
            }
            return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
        }

        // Геттеры для доступа к полям
        public String getSymbol() {
            return symbol;
        }

        public String getName() {
            return name;
        }

        public double getPreviousClosingPrice() {
            return previousClosingPrice;
        }

        public double getCurrentPrice() {
            return currentPrice;
        }
    }


