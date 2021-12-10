public class 핸드폰번호가리기 {
    public String solution(String phone_number) {
        String answer = "";
        String newAnswer = "";
        String backAnswer = "";
        answer = phone_number.substring(0,phone_number.length()-4);
        for(int i = 0;i<answer.length();i++){
            newAnswer+="*";
        }
        backAnswer = phone_number.substring(phone_number.length()-4);


        return newAnswer+backAnswer;    }
    public static void main(String[] args) {
        // write your code here
        String x = "0133334444";

        핸드폰번호가리기 solution = new 핸드폰번호가리기();
        System.out.println(solution.solution(x));
    }
}
