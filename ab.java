abstract class mobile{
      void Voicecall(){
        System.out.println("you can make voice call");
      }
      abstract void camera();
      abstract void touchdiplay();
}
class vivo extends mobile{
      void camera(){
        System.out.println("It has 64mp camara");
      }
      void touchdiplay(){
        System.out.println("It is touchable");
      }
      void fingerprint(){
        System.out.println("It has fingerprint");
      }
}
class nokia extends mobile{
      void camera(){
        System.out.println("It has 8mp camara");
      }
      void touchdiplay(){
        System.out.println("It is touchable");
      }
}
class ab{
    public static void main(String[] args){
      System.out.println("...........VIVO..........");
        vivo v1=new vivo();
        v1.Voicecall();
        v1.camera();
        v1.touchdiplay();
        v1.fingerprint();
        System.out.println("...........NOKIA..........");
        nokia n1=new nokia();
        n1.Voicecall();
        n1.camera();
        n1.touchdiplay();
    }
}