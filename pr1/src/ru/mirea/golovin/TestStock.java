package ru.mirea.golovin;

public class TestStock {
    public static void main(String[] args) {
        // Создаем объект акции
        Stock stock1 = new Stock("SBER", "ПАО Сбербанк", 281.5, 282.87);

        // Выводим информацию о акции
        System.out.println("Информация о акции:");
        System.out.println("Название: " + stock1.getName());
        System.out.println("Текущая цена: " + stock1.getCurrentPrice());

        // Выводим процент изменения стоимости акций
        System.out.println("Процент изменения стоимости акций равен: " + stock1.getChangePercent() + "%");
    }

}
