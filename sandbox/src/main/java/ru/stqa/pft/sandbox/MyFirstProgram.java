package ru.stqa.pft.sandbox;

public class MyFirstProgram {
   public static void main(String[] args) {
      hello("Tatiana");

      Square s = new Square(3);
      System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

      Rectangle r = new Rectangle(5,6);
      System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

      Point p = new Point(1,2, 3, 4);
      System.out.println("Расстояние между двумя точками с координатами " + "(" + p.x1 + " , " + p.y1 + ") и (" + p.x2 + " , " + p.y2 + ") = " + p.distance());

   }

   public static void hello (String user) {
      System.out.println("Hello " + user);
   }

}
