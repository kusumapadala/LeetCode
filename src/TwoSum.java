import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
     twoSum(new int[]{1,3,4,2}, 6);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 1; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            var var = map.get(target-nums[i]);
            if(var!=null && var!=i) {
                int index = map.get(target - nums[i]);
                    result[0] = i;
                    result[1] = index;
                    break;
            }
        }
        return result;
    }

//    public static int[] twoSum(int[] nums, int target) {
//        int[] result = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    result[0] = i;
//                    result[1] = j;
//                    return result;
//                }
//            }
//        }
//        return result;
//    }
}