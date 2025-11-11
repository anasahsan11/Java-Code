package Day28;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        int n=s.length(),m=t.length();
        if(n!=m) return false;
        int []hash1=new int[26];
        int []hash2=new int[26];
        for(int i=0;i<n;i++){
            hash1[s.charAt(i)-'a']++;
            hash2[t.charAt(i)-'a']++;
        }

        for(int i=0;i<26;i++){
            if(hash1[i]!=hash2[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
