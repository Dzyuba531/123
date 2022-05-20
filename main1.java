package com.max.idea;
import java.util.Scanner;
public class main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Введіть кіл-сть рядків: ");
            int n = input.nextInt();
            if(n<=0){
                throw new Exception("Кіл-сть рядків повиинна бути більшою за 0");
            }
            System.out.println("Введіть кіл-сть стовпців: ");
            int m = input.nextInt();
            if(m<=0){
                throw new Exception("Кіл-сть стовпців повиинна бути більшою за 0");
            }
            int array[][] = new int[n][m];
            System.out.println("Заповніть масив: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    array[i][j] = input.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println("Номер ряда в якому є 0: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (array[i][j] == 0)
                        System.out.print(i + 1 + "; ");
                }
            }
            System.out.println();
            System.out.println("________________");
            System.out.println("Рядки в яких є 0: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (array[i][j] == 0) {
                        int mas[] = array[i];
                        for (int k = 0; k < m; k++) {
                            System.out.print(mas[k] + "\t");
                        }
                        System.out.println();
                    }
                }
            }
        }
        catch(Exception c){
            System.out.println(c.getMessage());
        }
    }
}