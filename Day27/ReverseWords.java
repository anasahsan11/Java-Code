package Day27;

public class ReverseWords {
    public static String reverseString(String s){
        String []words=s.split(" +");
        StringBuilder sb=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        String s = "My name is Anas Ahsan";
        System.out.println("The reverse string:"+ reverseString(s));
    }
}
