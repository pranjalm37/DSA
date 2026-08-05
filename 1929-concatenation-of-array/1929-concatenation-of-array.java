class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int len=2*n;
        int arr[]=new int[len];
        for(int i=0;i<len;i++)
        {
            arr[i]=nums[i%n];
        }
        return arr;
        
    }
}