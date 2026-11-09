public class Solution {
    public String encode(List<String> list) {
        StringBuilder result = new StringBuilder();
        for (String text : list) {
            result.append(text.length()).append("#").append(text);
        }
        return result.toString();
    }

    public List<String> decode(String text) {
        List<String> list = new ArrayList<>();
        int index = 0;
        while (index < text.length()) {
            int hashIndex = text.indexOf('#', index);
            int length = Integer.parseInt(text.substring(index, hashIndex));
            int start = hashIndex + 1;
            int end = start + length;
            list.add(text.substring(start, end));
            index = end;
        }
        return list;
    }
}
