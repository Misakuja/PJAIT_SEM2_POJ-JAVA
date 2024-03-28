package LAB04.LAB04_Ex02;
public class LAB04_Ex02_ClassSquare {
     private final double side;

     public LAB04_Ex02_ClassSquare(double side) {
         this.side = side;
     }

     public double SquareArea() {
         return side * side;
     }

     public double SquarePerimeter() {
         return side * 4;
     }
 }
