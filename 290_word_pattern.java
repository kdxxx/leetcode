class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String st[] = s.split(" ");
        if(st.length!=pattern.length())
            return false;

        HashMap<Character,String> hm = new HashMap<>();
        HashSet<String> hs = new HashSet<>();
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);

            if(hm.containsKey(ch)){
                String s1 = hm.get(ch);
                String s2 = st[i];
                if(!s1.equals(s2))
                    return false; 
            }else{
                hm.put(ch,st[i]);
                hs.add(st[i]);
            }
        }

        if(hs.size()!=hm.size())
        return false;
        return true;
    }
}
