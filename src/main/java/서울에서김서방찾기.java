import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 서울에서김서방찾기 {
    public String solution(String[] seoul) {
        String answer="";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(seoul));
        List<String> list1 = new ArrayList<>(Arrays.asList(seoul));

        System.out.println(list);
        System.out.println(list1);

        answer = "김서방은 " + list1.indexOf("Kim")+ "에 있다";
        return answer;
    }
    public static void main(String[] args) {
        서울에서김서방찾기 seoul = new 서울에서김서방찾기();
        String [] s = {"les","Kim","choi","jung"};
        System.out.println(seoul.solution(s));
    }
}
