class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> hashset = new HashSet<Integer>();
        int longestStreak = 0;
        for(int i: nums){
            hashset.add(i);
        }
        for(int num : nums){
            if(!hashset.contains(num-1)){
                int currentNum = num;
                int currentStreak = 1;
                while(hashset.contains(currentNum +1)){
                    currentNum++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
}
