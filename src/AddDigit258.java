import java.util.Scanner;

public class AddDigit258{

    public static int add(long num)
    {
        int sum=0;
        while(num>0 || sum>9)
        {
            sum+=(num%10);
            num=num/10;
            if(num==0 && sum >9)
            {
                num=sum;
                sum=0;
            }
        }
        return sum;
        // we can do this is O(1) => if(num%9==0) ans is 9 else ans is num%9 (remainder)
        /*if(num!=0 && num%9==0)
            return 9;
        else 
           return num%9;*/
    }
    public static void main(String [] args)
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Number: ");
         long a=sc.nextLong();
         
         int ans=add(a);
         System.out.println("Ans is: ");
         System.out.print(ans);
    }
}