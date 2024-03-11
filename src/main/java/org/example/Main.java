package org.example;

// Parçalı fonksiyon - girilen x değeri için y'yi hesaplayan program. Duruma göre rakamlar değişkenlik gösterebilir.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    float x,y;

        Scanner scanner = new Scanner(System.in);

        System.out.println("x noktasını giriniz : ");
        x = scanner.nextFloat();

        if (x<0)
            y=1;
        else if ((0<=x) && (x<=2))
            y=x;
        else if ((2<x) && (x<=4))
            y=3;
        else
            y=4-x;
        System.out.printf("Fonksiyonun x = %.2f noktasındaki değeri = %.2f",x,y);
    }
}