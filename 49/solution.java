class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> groupAnagram = new HashMap<>();

        for(String st : strs){
            int [] freqArr = new int[26];

            for(char stCh : st.toCharArray()){
                freqArr[stCh - 'a']++;
            }

            StringBuilder stb = new StringBuilder();
            for(int elem : freqArr){
                stb.append("v");
                stb.append(elem);
            }

            String key = stb.toString();
            if(!groupAnagram.containsKey(key)){
                groupAnagram.put(key, new ArrayList<String>());
            }
            groupAnagram.get(key).add(st);
        }

        return new ArrayList(groupAnagram.values());
    }
}