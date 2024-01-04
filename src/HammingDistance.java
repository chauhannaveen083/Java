import java.util.*;

public class HammingDistance {
    public static int ans(int x, int y) {
            int xorValue=x^y;
            int ans=0;
            
            while(xorValue !=0)
            {
             if((xorValue&1)==1)
                 ans++;
            xorValue=xorValue>>1;
            }
            return ans;
        }

    public static void main(String[] args)throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter 1st Number: ");
            int a=sc.nextInt();
            System.out.print(" enter 2st Number: ");
            int b=sc.nextInt();
            System.out.println("Result: ");
            System.out.print(ans(a,b));
        }
    }
}