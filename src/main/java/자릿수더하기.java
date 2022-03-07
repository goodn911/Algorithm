public class 자릿수더하기 {
    public int solution(int n) {
        String s = String.valueOf(n);
        int answer = 0;



//
//        while (n>0){
//            answer+=n % 10;
//            n/=10;
//        }
//        for(int i = 0 ; i<s.length();i++){
//            answer+= Integer.parseInt(s.substring(i,i+1));
//
//        }

        return answer;
    }

    public static void main(String[] args) {
        // write your code here
        int n = 123;

        자릿수더하기 solution = new 자릿수더하기();
        System.out.println(solution.solution(n));
    }
}
