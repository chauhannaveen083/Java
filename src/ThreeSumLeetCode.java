import java.util.*;
public class ThreeSumLeetCode {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    //Arrays.asList()

                    // Skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                }
            }
        }

        return result;
    }
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int list[]=new int[n];
        for(int i=0;i<n;i++)
        {
            list[i]=sc.nextInt();
        }
        List<List<Integer>>ans=threeSum(list);
        System.out.println(ans+" ");
        for(List<Integer>result:ans)
        {
            System.out.print(result+" ");
        }

        
    }

}
