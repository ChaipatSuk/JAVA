public class Ex6_4{
  public static void main(String[] args){
    int[] inum={1,2,3,4,5,6};
    double[] dnum={6.0,4.4,1.9,2.9,3.4,3.5};
    int avri=average(inum);
    double avrd=average(dnum);
    System.out.println("The average value as integer is "+avri);
    System.out.println("The average value as double is "+avrd);
  }
  public static int average(int[] array){
    int sumi=0;
    for(int i=0;i<6;i++){
     sumi+=array[i]; 
    }
    return sumi/6;
  }
  public static double average(double[] array){
    double sumd=0;
    for(int i=0;i<6;i++)
    {
      sumd = sumd+array[i];
    }
    return sumd/6;
  }
}