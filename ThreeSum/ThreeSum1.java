import java.util.*;

public class ThreeSumFixed {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        
        Arrays.sort(nums); 
        
        Set<List<Integer>> resultSet = new LinkedHashSet<>();
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int k = 0; k < n; k++) {
            map.put(nums[k], k);
        }

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < n; j++) {
                int sum = nums[i] + nums[j];
                int diff = 0 - sum;

                if (map.containsKey(diff) && map.get(diff) > j) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], diff);
                    resultSet.add(triplet);
                }
            }
        }
        
        List<List<Integer>> finalResult = new ArrayList<>(resultSet);
        return finfinalResult;
    }
}