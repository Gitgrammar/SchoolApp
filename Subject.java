public class Subject {
   private String subject;
   private int score;
   
   
   //コンストラクタ
public Subject(String subject,int score){
    this.subject=subject;
    this.score=score;
}
//メソッド
void showInfo(){
System.out.println(this.subject+":");
}
  }
  