interface Animals {
    void sound();
    void sleep();
}
class Dog implements Animals {
    public void sound() {
        System.out.println("Dog barks");
    }
   public  void sleep(){
        System.out.println("Dog sleeps");
    }
    public  void slee(){
        System.out.println("Dog sleeps");
    }
}
 class animal {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
        d.sleep();
        d.slee();
    }
}
