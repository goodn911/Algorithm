public class 음양더하기 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            answer += absolutes[i]*(signs[i]?1:-1);
        } return answer;

    }


    public static void main(String[] args) {
        // write your code here
        int x[] = {4, 7, 12};
        boolean y[]={true,false,true};

        음양더하기 solution = new 음양더하기();
        System.out.println(solution.solution(x,y));

    }
}
