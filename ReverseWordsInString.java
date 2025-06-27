import java.util.*;
public class ReverseWordsInString 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); 
        Stack<Character> st = new Stack<>();
        String ans = "";
        for (int i=0;i<s.length();i++) 
        {
            if (s.charAt(i)==' ') 
            {
                while(!st.isEmpty()) 
                {
                    ans+=st.pop();
                }
                ans+=" "; 
            } 
            else 
            {
                st.push(s.charAt(i));
            }
        }
        while(!st.isEmpty()) 
        {
            ans+=st.pop();
        }
        System.out.print(ans);
    }
}
