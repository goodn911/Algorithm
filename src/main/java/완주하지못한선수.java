import java.lang.reflect.Array;
import java.util.Arrays;

public class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {

        Arrays.sort(participant);
        Arrays.sort(completion);
        System.out.println(Arrays.toString(participant));
        System.out.println(Arrays.toString(completion));
        int i;
        for( i= 0; i<completion.length;i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }

        return participant[i];
    }


    public static void main(String[]args){
        완주하지못한선수 fail = new 완주하지못한선수();

        String[] a = {"kiki", "eden","leo","leo"};
        String[] b = {"eden", "kiki"};

        System.out.println(fail.solution(a,b));
    }

}
