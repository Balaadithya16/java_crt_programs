public class nine {
    public static void main(String[] args) {
        int r=5 ,c=9;
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(j==r-i-1 || j==r+i-1|| (i==r/2&&j==c/2)){
            System.out.print("*");  
            }
            else{
                System.out.print(" ");  
                }
    }
    System.out.println(" ");  
}
    }  
}
