public class eight {
    
        public static void main(String args[]){
            int c=9,r=9;
            for(int i=0;i<r-1;i++){
                for(int j=0;j<c-i+1;j++){
                    System.out.print(" ");
                }
                for(int k=0;k<2*i+1;k++){
                    if(k==0 || k==i*2 || i==r-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                }
                System.out.println();
            }
            for(int i=r-2;i>=0;i--){
                for(int j=0;j<c-i+1;j++){
                    System.out.print(" ");
                }
                for(int k=0;k<2*i+1;k++){
                   if(k==0 || k==i*2 || i==r-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                }
                System.out.println();
            }
        }
}
