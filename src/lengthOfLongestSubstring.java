import java.util.HashSet;
import java.util.Scanner;

public class lengthOfLongestSubstring {
    //Longest Substring Without Repeating Characters
    public static int func(String s) {
    int ans=0;
    if(s.length()==0)
    return ans;
    ans = 1;
    HashSet<Character> set = new HashSet<>();
    int left = 0, right = 0;
    while (right < s.length()) {
        if (set.contains(s.charAt(right))) {
            set.remove(s.charAt(left));
            left++;
        } else {
            set.add(s.charAt(right));
            right++;
            int sz = set.size();
            ans = Math.max(ans, sz);
        }
    }

    return ans;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int ans=func(s);
        System.out.println(ans);
    }
}
