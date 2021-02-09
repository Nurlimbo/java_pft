package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
      hello("23");
      hello("user");

      int a = 4;
      System.out.println("Площадь кв " + a + " = "+ arik(a));

      int l = 5;
      int b = 5;
      System.out.println("Площадь прям " + l +" и " + b + " = "+ aric(l, b));
    }
    public static void hello(String a) {
      System.out.println("Hello, " + a + "!");
    }
    public static int arik(int a) {
      return a*a;
    }
    public static int  aric(int l, int b) {
      return l * b;
    }
}