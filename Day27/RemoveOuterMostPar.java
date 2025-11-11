package Day27;

public class RemoveOuterMostPar {
    public static String removeOuterMostParenthesis(String s){
        StringBuilder sb=new StringBuilder();
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')') cnt--;
            if(cnt!=0) sb.append(s.charAt(i));
            if(s.charAt(i)=='(') cnt++;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        System.out.println(removeOuterMostParenthesis(s));
    }
}
