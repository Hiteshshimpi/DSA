public class DuplicateNumber {
    public static void main(String args[]) {
      int [] nums = {1,3,4,2,2};
      int slow=0;
      int fast=0;

      //to aleast execute once
        do{
            slow = nums[slow];
            fast = nums[fast];
            fast = nums[fast];
            if(slow == fast){
                break;
            }
        }while (slow != fast);
        slow = 0;
        while(slow != fast)
        {
            slow= nums[slow];
            fast = nums[fast];
        }
        System.out.println(fast);
    }
}
