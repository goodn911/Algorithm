import java.util.*;

public class 문자열개수 {
    public int solution(String str,char c) {
        int answer=0;

        str = str.toUpperCase();
        c= Character.toUpperCase(c);
//
//        for(int i =0;i<str.length();i++){
//            if(str.charAt(i)==c){
//                answer++;
//            }
//        }
        for(char x : str.toCharArray()){
            if(x==c){
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        문자열개수 solution = new 문자열개수();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.println(solution.solution(str,c));
    }
}
