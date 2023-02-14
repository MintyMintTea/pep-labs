
import java.util.ArrayList;
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        Integer[] numsArr = new Integer[nums.size()];
        nums.toArray(numsArr);
        int j = 0;
        int max = nums.size() == 1 ? numsArr[0] + numsArr[1] : numsArr[0];
        for(int i = 0; i < numsArr.length;i++)
        {
            int sum = numsArr[j]+numsArr[i];
            if(sum > max){
                max = sum;
            }
            if(numsArr[j] < numsArr[i]){
                j = i;
            }
        }
        return max;
    }
}