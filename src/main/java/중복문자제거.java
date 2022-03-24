import java.util.Scanner;

public class 중복문자제거 {
    public String solution(String str) {
        String answer = "";
        char[] s = str.toCharArray();
        for(int i = 0; i<str.length();i++){
//            System.out.println(str.charAt(i)+" "+i+ " " +str.indexOf(str.charAt(i)));
//            System.out.println(s[i]+" "+i +" " +str.indexOf(s[i]));
        if(str.indexOf(s[i])==i){
            answer+= s[i];
        }

        }

        return answer;
    }

    public static void main(String[] args) {
        중복문자제거 solution = new 중복문자제거();
        Scanner kb = new Scanner(System.in);

        String str=kb.next();
        System.out.println(solution.solution(str));
    }
}
