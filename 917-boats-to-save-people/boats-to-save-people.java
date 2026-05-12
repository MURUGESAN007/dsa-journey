class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0,count = 0,right = people.length-1;
        while(left <= right){
            int sum = people[left]+people[right];
            if(sum <= limit){
                count++;
                right--;
                left++;
            }else{
                count++;
                right--;
            }
        }
        return count;
    }
}