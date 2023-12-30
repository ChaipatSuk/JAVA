import java.util.*;
public class Ex6_1{
  public static void main(String[] args){
    int size,randNum=0,score=0;
    Scanner in=new Scanner(System.in);
    System.out.print("Enter the number of Array size:");
    size=in.nextInt();
    System.out.println("Your Array:");
    int[] num= new int[size];
    for(int i=0;i<size;i++){
      randNum=(int)(Math.random()*99);
      num[i]=randNum;
      if(num[i]%10==4||num[i]%10==9){
        score++;
        if(num[i]%7==0){
         score++; 
        }
      }
    }
    System.out.print("{");
    for(int i=0;i<size;i++){
     System.out.print(num[i]+" "); 
    }
    System.out.println("}");
    System.out.print("Your array scores: "+score);
    in.close();
  }
}