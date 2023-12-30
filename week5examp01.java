import java.util.Scanner;

public class week5examp01{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter 3 numbers: ");
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
    boolean ch;
    ch = condition(a,b,c);
    System.out.println(ch);
    scanner.close();
  }
  static boolean condition(double a, double b, double c){
  boolean result;
  if(((a>b)&&(a>c))&&((c<a)&&(c<b))){
    result = false ;
  }
  else if(((a>b)&&(a>c))||((c<a)&&(c<b))){
    result = true ;
  }
  else{
    result = false ;
  }
  return result;
  }
  
}