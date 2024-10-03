
class Solution {
    public List<Integer> findMajority(List<Integer> nums) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        
        if (nums == null || nums.size() == 0) {
            ans.add(-1);
            return ans;
        }
        int times = nums.size() / 3;
        Collections.sort(nums);

        int count = 1;

        for (int i = 1; i < nums.size(); i++) {
            if (!nums.get(i).equals(nums.get(i - 1))) {
                if (count > times) {
                    ans.add(nums.get(i - 1));
                }
                
                count = 1;
            } else {
                
                count++;
            }
        }

        if (count > times) {
            ans.add(nums.get(nums.size() - 1));
        }

        if (ans.isEmpty()) {
            ans.add(-1);
        }

        return ans;
    }
}