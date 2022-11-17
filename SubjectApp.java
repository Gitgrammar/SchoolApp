import java.util.*;

public class SubjectApp {
 public static void main(String[] args) {
    System.out.print("何科目ありますか?>>");
    Scanner sc=new Scanner(System.in);
    int subjectsNum=sc.nextInt();
    
Subject subName=new Subject();



for(int i=1;i<subjectsNum+i;i++){
String selectedSub=sc.nextLine();
System.out.print(i+"科目の名前>>"+selectedSub);
int inputScore=sc.nextInt();
System.out.print(i+"科目の点数>>"+inputScore);
subName.setScore(inputScore);
}
}
 }

