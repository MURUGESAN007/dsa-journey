class Solution {
    public int reverse(int x) {
        int n = Math.abs(x);
        int rev=0;
		while(n>0)
		{
			int l=n%10;
            if(rev>(Integer.MAX_VALUE - l)/10){
                return 0;
            }
			rev=(rev*10)+l;
			n/=10;
		}
		return (x<0)? (-rev):rev;
        
    }
}