class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int [] charFreq = new int[26];

        char [] sArr = s.toCharArray();
        char [] tArr = t.toCharArray();

        for(int i = 0; i < s.length(); i++){
            charFreq[sArr[i] - 'a']++;
            charFreq[tArr[i] - 'a']--;
        }

        for(int i = 0 ; i < charFreq.length; i++){
            if(charFreq[i] > 0) return false;
        }

        return true;
    }
}