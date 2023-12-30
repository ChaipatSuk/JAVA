import java.util.Scanner ;
  
public class week5examp05 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int number, i, rev;
    System.out.print("Enter an integer :");
    number = scanner.nextInt();
    for(i=1;i<=9999;i++)
    {
      rev = reverse(number);
      System.out.print(rev);
      number = number/10;
      if(number==0)
      {
        break;
      }
    }
    scanner.close();
  }
  
  public static int reverse(int number){
    int digi;
    digi = number%10;
    return digi;
  }
}