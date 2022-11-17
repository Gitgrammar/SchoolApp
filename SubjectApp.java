import java.util.*;

public class SubjectApp {
 public static void main(String[] args) {
    System.out.print("何科目ありますか?>>");
    Scanner sc=new Scanner(System.in);
    int subjectsNum=sc.nextInt();
    String[]selectedSubs=new String[subjectsNum];
    int[]inputScores=new int[subjectsNum];
Subject sub=new Subject(null, subjectsNum);

for(int i=0;i<subjectsNum;i++){
    
System.out.print(i+1+"科目の名前>>");
String inputSub=sc.next();
selectedSubs[i]=inputSub;
System.out.print(i+1+"科目の点数>>");
int inputScore=sc.nextInt();
inputScores[i]=inputScore;
}
System.out.println(Arrays.toString(selectedSubs));
System.out.println(Arrays.toString(inputScores));

}
 }

