package ru.stqa.pft.sandbox;

import java.util.Scanner;

public class SimpleCalc {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Введите а: ");
    int a = in.nextInt();
    System.out.print("Введите б: ");
    int b = in.nextInt();
    System.out.print("Введите операцию: ");
    char oper = in.next().charAt(0);
    int rez=0;
    switch (oper) {
      case '+':
        rez = a + b;
        break;
      case '-':
        rez = a - b;
        break;
      case '*':
        rez = a * b;
        break;
      case '/':
        rez = a / b;
        break;
    }
    System.out.println(a + "+" + b + "=" + rez);
    in.close();
  }
}