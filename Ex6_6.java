import java.util.Scanner;
public class Ex6_6 {
    public static void main(String[] args) {
        double[][] m1,m2,m3;
        m1 = new double[3][3];
        m2 = new double[3][3];
        m3 = new double[3][3];
        Scanner in = new Scanner(System.in);
        for(int k =0;k<=1;k++){
            if(k==0){
                System.out.print("Enter matrix1 : ");
            }
            if(k==1){
                System.out.print("Enter matrix2 : ");
            }
            for(int i=0;i<=2;i++){
                for(int j=0;j<=2;j++){
                    if(k==0){
                        m1[i][j]=in.nextDouble();
                    }
                    if(k==1){
                        m2[i][j]=in.nextDouble();
                    }
                }
            }
            System.out.print("\n");
        }
        in.close();
        m3=multiplyMatrix(m1,m2);
        System.out.println("The multiplication of the matrices is");
        for(int i=0;i<=2;i++){
            for(int k=0;k<=2;k++){
                for(int j=0;j<=2;j++){
                    if(k==0){
                        System.out.print(m1[i][j]+" ");
                    }
                    if(k==1){
                        System.out.print(m2[i][j]+" ");
                    }
                    if(k==2){
                        System.out.print(m3[i][j]+" ");
                    }
                }
                if(i==1&&k==0){
                    System.out.printf(" * ");
                }
                if(i==1&&k==1){
                    System.out.printf(" =  ");
                }
                else{
                    System.out.printf("\t");
                }
            }
            System.out.print("\n");
        }
    }
    public static double [ ][ ] multiplyMatrix(double [ ][ ] a, double [ ] [ ] b){
        double[][] c;
        c= new double[3][3];
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                c[i][j]=(a[i][0]*b[0][j])+(a[i][1]*b[1][j])+(a[i][2]*b[2][j]);
            }
        }
        return c;
    }
}