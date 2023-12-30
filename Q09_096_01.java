public class  Q09_096_01{
  public static void main (String[] args){
    CloseFigure rec1 = new Rectangle();
   CloseFigure rec2 = new Rectangle(5.0,4.8,"green");
   CloseFigure rec3 = new Rectangle(4.0,6.2);
   CloseFigure cir1 = new Circle(6.0);
   CloseFigure cir2 = new Circle();
   CloseFigure cir3 = new Circle(5.0,"yellow");
   
   System.out.println(rec3.toString());
   System.out.println(rec1.toString());
   System.out.println(rec2.toString());
   System.out.println(cir2.toString());
   System.out.println(cir3.toString());
   System.out.println(cir1.toString());
  }
}

abstract class CloseFigure{
 private String color;
 
 public CloseFigure(String color){
   this.color = color;
 }
 
 public CloseFigure(){
   this.color = "White";
 }
 
 public abstract double getArea();
 
 public String getColor(){
   return color;
 }
 
 public void setColor(String color){
   this.color = color;
 }
 
 public abstract double getPerimeter();
 
 public String toString(){
   return "(color)=("+getColor()+")";
 }
}

class Circle extends CloseFigure{
 private double radius;
 
 public Circle(double radius){
   super("White");
   this.radius = radius;
 }
 
 public Circle(){
   super("White");
   this.radius = 1.0;
 }
 
 public Circle(double radius, String color){
   super(color);
   this.radius=radius;
 }
 
 public double getDiameter(){
   return radius*2.0;
 }
 
 public double getPerimeter(){
   return 2*Math.PI*radius;
 }
 
 public double getArea(){
   return Math.PI*radius*radius;
 }
 
 public String toString(){
   return "(radius, diameter, area, perimeter, color)=("+radius+","+getDiameter()+","+getArea()+","+getPerimeter()+","+getColor()+")";
 }
}

class Rectangle extends CloseFigure{
 private double width;
 private double length;
 
 public Rectangle(){
   super("White");
   this.width = 1.0;
   this.length = 1.0;
 }
 
 public Rectangle(double width, double length){
   super("White");
   this.width = width;
   this.length = length;
 }
 
 public Rectangle(double width, double length, String color){
   super(color);
   this.width = width;
   this.length = length;
 }
 
 public double getWidth(){
   return width;
 }
 
 public double getLength(){
   return length;
 }
 
 public double getArea(){
   return width*length;
 }
 
 public double getPerimeter(){
   return 2.0*(width+length);
 }
 
 public String toString(){
   return "(width, length, area, perimeter, color)=("+getWidth()+","+getLength()+","+getArea()+","+getPerimeter()+","+getColor()+")";
 }
}