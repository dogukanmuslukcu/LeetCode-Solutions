public class Main {

    public static void main(String[] args) {

        int num = 0 ;
        int[] nums2 =new int[nums.length];
        for(int i =0 ; i<nums.length ; i++)
        {
            nums2[i]=nums[i];
        }
        Arrays.sort(nums2);
        for(int i =0 ; i<nums.length-1 ; i++)
        {
            if(nums2[i]-nums2[i+1]==0)
            {
                num = nums2[i];
            }
        }
        return num;
    }
}
