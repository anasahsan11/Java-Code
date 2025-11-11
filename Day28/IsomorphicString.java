package Day28;
public class IsomorphicString {
    public  static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        int []hash1=new int[256];
        int []hash2=new int[256];
        
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i),ch2=t.charAt(i);
            if(hash1[ch1]!=hash2[ch2]) return false;
            hash1[ch1]=i+1;
            hash2[ch2]=i+1;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "egg", t = "add";
        System.out.println(isIsomorphic(s, t));
    }
}
