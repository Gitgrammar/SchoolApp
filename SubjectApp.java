import java.util.*;

public class SubjectApp {
 public static void main(String[] args) {
    System.out.print("何科目ありますか?>>");
    Scanner sc=new Scanner(System.in);
    int subjectsNum=sc.nextInt();
    
Subject subName=new Subject();


for(int i=1;i<subjectsNum;i++){
    
System.out.print(i+"科目の名前>>");
String selectedSub=sc.next();
System.out.println("入力された文字は"+selectedSub);


System.out.print(i+"科目の点数>>");
int inputScore=sc.nextInt();
subName.setScore(inputScore);
}
}
 }

