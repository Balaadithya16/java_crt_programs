class rectangle{
    int len;
    int wid;
    rectangle(){
      System.out.println("Constructor loaded");
      len=2;
      wid=5;
    }
    int area(){
        int a=len*wid;
        return a;
    }
}
  class constructor{
    public static void main(String args[]){
        rectangle r=new rectangle();
        System.out.println(r.area());
    }
}