class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();

        boolean match1 = true;
        boolean match2 = true, match3 = true;

        // all capital
        for(int i = 0; i< n; i++){
            if(!Character.isUpperCase(word.charAt(i))){
                match1 = false; 
                break;
            }
        }
        if(match1) return true;

        // all not capital
        for(int i = 0; i<n ; i++){
            if(!Character.isLowerCase(word.charAt(i))){
                match2 = false; 
                break;
            }
        }
        if(match2) return true;

        // all not capital except first
        if(match3)
            for(int i = 1; i<n ; i++){
                if(!Character.isLowerCase(word.charAt(i))){
                match3 = false; 
                break;
                }
            }
        
        if(match3) return true;

        // otherwise 
        return false;
    }
}
