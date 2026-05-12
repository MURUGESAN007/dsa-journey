class Solution {
    public boolean backspaceCompare(String s, String t) {
        return (check(s)).equals(check(t));
    }
    private String check(String s){
        Stack<Character> ans = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != '#'){
                ans.push(s.charAt(i));
            }else if(!ans.isEmpty()){
                ans.pop();
            }
        }
        return String.valueOf(ans);
    }
}