import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        }
              Arrays.sort(nums);
              int x = 0;
              boolean check1 = true;
           boolean check2 = true;

              for (int i = 0; i < nums.length; i++) {
                  if (nums[i] == 0) {
                      check1 = false;
                }
                   if (nums[i] == nums.length) {
                       check2 = false;
                   }
               }
             for (int i = 0; i < nums.length-1; i++) {
                   if (nums[i] - nums[i+1] != -1) {
                   x = nums[i]+1;
                  }
             }

               if (check1) {
             System.out.println(0);
             } else if (check2) {
                  System.out.println(nums.length);
              } else {
                   System.out.println(x);
               }

    }
}
