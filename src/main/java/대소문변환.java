import java.util.Scanner;

public class 대소문변환 {
    public String solution(String str) {
        String answer = "";
        for(char x : str.toCharArray()){
            if(x>=97 && x<=122){
               answer+= (char)(x-32);
            }
            else {
                answer+= (char)(x+32);
            }
        }



        return answer;
    }
    public static void main(String[] args) {
        대소문변환 solution = new 대소문변환();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(solution.solution(str));
    }
}
