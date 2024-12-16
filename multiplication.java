public import java.util.Scanner;
class Multiplication {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter rows:");
       int r=sc.nextInt();
       System.out.print("Enter columns:");
       int c=sc.nextInt();
       int[][] arr1=new int[r][c];
       int[][] arr2=new int[r][c];
       int[][] mul=new int[r][c];
       System.out.println("Enter First Matrix:");
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               arr1[i][j]=sc.nextInt();
           }
       }
       System.out.println("Enter Second Matrix:");
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               arr2[i][j]=sc.nextInt();
           }
       }
       System.out.println("Multiplication Matrix:");
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               mul[i][j]=0;
               for(int k=0;k<r;k++){
                  mul[i][j]+=arr1[i][k]*arr2[k][j];
               }
               System.out.print(mul[i][j]+" ");
           }
           System.out.println();
       }
   }
   
}

