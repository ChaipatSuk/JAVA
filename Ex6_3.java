import java.util.*;
public class Ex6_3{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double[] num = new double[10];
    System.out.print("Enter ten numbers:");
    for(int i=0;i<10;i++)
    {
     num[i] = input.nextDouble(); 
    }
    input.close();
    int a=indexOfSmallestElement(num);
    System.out.print("The index of the min is "+a);
  }
  public static int indexOfSmallestElement(double[] array){
    int min=0;
    for(int i=0;i<10;i++){
      if(array[i]<=array[min]){
       min=i; 
      }
    }
    return min;
  }
}