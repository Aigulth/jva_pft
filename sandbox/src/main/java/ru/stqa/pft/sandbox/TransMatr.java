package ru.stqa.pft.sandbox;

import java.util.Arrays;
import java.util.Scanner;

public class TransMatr {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = 3;
    int[][] a = new int[n][n];
    int i, j, s;
 // формирование матрицы
    System.out.println("Исходная матрица: \n");
    for (i = 0; i < n; i++) {
      System.out.println();
      for (j = 0; j < n; j++) {
        a[i][j]=(int) (Math.random()*100);
        System.out.print(a[i][j]+" ");
      }
    }
    // транспонирование матрицы
    for (i = 0; i < n; i++) {
      for (j = i+1; j < n; j++) {
        s=a[i][j];
        a[i][j]=a[j][i];
        a[j][i]=s;
      }
    }
    // вывод транспонированной матрицы
    System.out.println();
    System.out.println("Транспонированная матрица: \n");
    for (i = 0; i < n; i++) {
      System.out.println();
      for (j = 0; j < n; j++) {
        System.out.print(a[i][j]+" ");
      }
    }
  }

}
