package LAB04.LAB04_Ex02;
public class Square {
     private final double side;

     public Square(double side) {
         this.side = side;
     }

     public double SquareArea() {
         return side * side;
     }

     public double SquarePerimeter() {
         return side * 4;
     }
 }
