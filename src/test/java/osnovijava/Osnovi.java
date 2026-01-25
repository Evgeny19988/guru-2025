package osnovijava;

import java.util.ArrayList;
import java.util.List;

public class Osnovi {
    public static void main(String[] args) {
        // Типы данных
        // Логический
        boolean varBoolean = true;
        // Целочисленный
        byte varByte = 10; // -128 ... 127 (-2 ^ 7) ... (2 ^ 7) -1)
        short varShort = 100; // -321768 ... 321767
        int varInt = 0; // самый популярный
        long varLong = 0L;
        var aVar = 10;
        // символ (под капотом тоже число)
        char varChar = 'f';
        // числа с плавающей точкой
        float varFloat = 0.0F;
        double varDouble0 = 36.0;
        String varString = "Selenide";

        int coinNominal = 2;
        String coinCurrency = "RUB";

        // Операторы
        // Математические
        int res = 4 + 4;
        int res1 = 4 - 3;
        int res2 = 4 / 3; // покажет целое число 1, без остатка
        int res3 = 4 * 4;
        // Сравнения
        boolean res5 = varInt >= 0;
        boolean res6 = varInt != 0;
        boolean res7 = varInt == 0; // сравнение
        // Логические
        // &&(и) - если что то не совпадет, остановится
        // & - сначала проверит все, после выдаст где ошибка
        // ||(или) - если что то не совпадет, остановится
        // | - сначала проверит все, после выдаст где ошибка
        //if ((coinNominal == 2) && (coinCurrency.equals("RUB")))
        // Ветвления
        if (coinCurrency.equals("RUB")) {
            System.out.println("Это рубль!");
        }
        else if (coinCurrency.equals("USD")) {
            System.out.println("Это доллар!");
        }
        else {
            System.out.println("Ничего не подошло");
        }
    }
}