package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
      hello("23");
      hello("user");

      Square s = new Square(4);
      System.out.println("Площадь кв " + s.a + " = "+ arik(s));

      Rectangle r = new Rectangle(5, 6);
      System.out.println("Площадь прям " + r.l +" и " + r.b + " = "+ aric(r));
    }
    public static void hello(String a) {
      System.out.println("Hello, " + a + "!");
    }
    public static int arik(Square s) {
      return s.a*s.a;
    }
    public static int  aric(Rectangle r) {
      return r.l * r.b;
    }
}