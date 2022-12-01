class Solution {
    public boolean halvesAreAlike(String s) {
        var set = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int first_vowel=0;
        int second_vowel=0;

        for(int i=0,j=s.length()-1;i<j;i++,j--){
            first_vowel+=set.contains(s.charAt(i))?1:0;
            second_vowel+=set.contains(s.charAt(j))?1:0;
        }

        return first_vowel==second_vowel;
    }
}
