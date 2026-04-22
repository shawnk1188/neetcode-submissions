class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        char[] charArray = s.toCharArray();
        String commPrefix = "";
        for(int i=0 ; i < charArray.length; i ++){
            if(checkIfPrefix(strs, i)){
                commPrefix = commPrefix + charArray[i];
            } else {
                break;
            }
        }
        return commPrefix;
    }

    private boolean checkIfPrefix(String[] strs, int i){
        for(String s: strs){
            if (i >= s.length() || s.charAt(i) != strs[0].charAt(i)){
                return false;
            }
        }
        return true;
    }
}