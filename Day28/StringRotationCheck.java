package Day28;

public class StringRotationCheck {
    public  static boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        String doubled=s+s;
        return doubled.contains(goal);

        
    }
    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";
        System.out.println(rotateString(s, goal));
    }
}
