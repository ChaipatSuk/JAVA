import java.util.*;
public class Ex6_5{
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int[] num=new int[5];
    int r0,r1,r2,r3,r4;
    for(int i=0;i<5;i++){
      System.out.print("Read a number: ");
      num[i]=in.nextInt();
    }
    in.close();
    r0=(int)(Math.random())*5;
    do
    {
      r1=(int)(Math.random()*5);
    }while(r1==r0);
    do
    {
      r2=(int)(Math.random()*5); 
    }while(r2==r0||r2==r1);
    do
    {
      r3=(int)(Math.random()*5); 
    }while(r3==r0||r3==r1||r3==r2);
    do
    {
      r4=(int)(Math.random()*5); 
    }while(r4==r0||r4==r1||r4==r2||r4==r3);
   System.out.println(num[r0]);
   System.out.println(num[r1]); 
   System.out.println(num[r2]); 
   System.out.println(num[r3]);
   System.out.println(num[r4]); 
  }
}