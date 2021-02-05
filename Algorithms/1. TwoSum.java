class sSolution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        
        for(int i = 0 ; i < nums.length; i ++){
            for(int j = i+1 ; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        
      return result;
    }
}

// Linear time and memory space java solution

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         Map<Integer, Integer> prevMap = new HashMap<>();
        
//         for (int i = 0; i < nums.length; i++) {
//             int diff = target - nums[i];
            
//             if (prevMap.containsKey(diff)) {
//                 return new int[]{ prevMap.get(diff), i };
//             }
//             prevMap.put(nums[i], i);
//         }
//         return new int[0]; // Guranteed solution, no need for return
//     }
// }


// Linear time and memory space python solution
// class Solution:
//     def twoSum(self, nums: List[int], target: int) -> List[int]:
//         prevMap = {} # val : index
        
//         for i, n in enumerate(nums):
//             diff = target - n
//             if diff in prevMap:
//                 return [prevMap[diff], i]
//             prevMap[n] = i
//         return