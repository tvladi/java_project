package ru.stqa.pft.sandbox;

public class MyFirstProgram {
   public static void main(String[] args) {
      hello("Tatiana");

      Square s = new Square(3);
      System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

      Rectangle r = new Rectangle(5,6);
      System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

      Point p1 = new Point(1,2);
      Point p2 = new Point(3,4);
      //System.out.println("Расстояние между двумя точками с координатами " + "(" + p1.x + " , " + p1.y + ") и (" + p2.x + " , " + p2.y + ") = " + distance(p1,p2));
      double distance = p2.distance(p1);
      System.out.println("Расстояние между двумя точками с координатами " + "(" + p1.x + " , " + p1.y + ") и (" + p2.x + " , " + p2.y + ") = " + distance);


   }

   public static void hello (String user) {
      System.out.println("Hello " + user);
   }

   public static double distance(Point p1, Point p2) {
      double xResult = p2.x - p1.x;
      double yResult = p2.y - p1.y;
      double sumXY = xResult * xResult + yResult * yResult;
      return Math.sqrt(sumXY);
   }

}
