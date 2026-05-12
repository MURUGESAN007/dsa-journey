class Solution {
    public boolean backspaceCompare(String s, String t) {
        return (check(s)).equals(check(t));
    }
    private String check(String s){
        Stack<Character> ans = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch != '#'){
                ans.push(ch);
            }else if(!ans.isEmpty()){
                ans.pop();
            }
        }
        return String.valueOf(ans);
    }
}