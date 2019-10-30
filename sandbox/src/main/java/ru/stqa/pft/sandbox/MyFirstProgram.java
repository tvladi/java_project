package ru.stqa.pft.sandbox;

public class MyFirstProgram {
   public static void main(String[] args) {
      hello("Tatiana");

      double len = 3;
      System.out.println("Площадь квадрата со стороной " + len + " = " + area(len));

      double a = 5;
      double b = 6;
      System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a,b));
   }

   public static void hello (String user) {
      System.out.println("Hello " + user);
   }

   public static double area (double l) {
      return l * l;
   }

   public static double area (double a, double b) {
      return a * b;
   }
}
