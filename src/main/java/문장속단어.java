import java.util.Scanner;

public class 문장속단어 {
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
//        String[] split = str.split(" ");
//        for(String x : split){
//            int len = x.length();
//            if(len > m ){
//                m = len;
//                answer = x;
//            }
//        }
        int pos;
        while ((pos=str.indexOf(' '))!=-1){
           String sub = str.substring(0,pos);
           int len= sub.length();
           if(len>m){
               m = len;
               answer = sub;
           }
           str = str.substring(pos+1);
        }
        if(str.length()>m){
            answer = str;
        }


        return answer;
    }
    public static void main(String[] args) {
        문장속단어 solution = new 문장속단어();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.println(solution.solution(str));
    }
}
