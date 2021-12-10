public class 문자열py개수 {
    boolean solution(String s) {
        boolean answer = true;
        char[] str = s.toCharArray();
        int cntp =0;
        int cnty=0;
        for(int i= 0;i<s.length();i++){
            if(str[i]=='p'||str[i]=='P'){
                cntp+=1;
            }else if(str[i]=='y'||str[i]=='Y'){
                cnty+=1;
            }


        }
        if(cntp!=cnty){
            return false;
        }

        return answer;
    }
    public static void main(String[] args) {
        // write your code here

        문자열py개수 solution = new 문자열py개수();
        System.out.println(solution.solution("yyppp"));

    }
}
