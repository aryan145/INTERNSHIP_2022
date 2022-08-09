class Algo1_day4_2 {
    public String reverseWords(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        
        char[] chars = s.toCharArray();
        int start = 0, end = 0;
        while (end < chars.length) {
            if (chars[end] == ' ') {
                reverse(chars, start, end - 1);
                start = end + 1;
                end = start + 1;
            } else {
                end++;
            }
        }
        
        reverse(chars, start, end - 1);
        
        return new String(chars);
    }
    
    private void reverse(char[] chars, int start, int end) {
        while (start < end) {
            swap(chars, start, end);
            start++;
            end--;
        }
    }
    
    private void swap(char[] chars, int i, int j) {
        char tmp = chars[i];
        chars[i] = chars[j];
        chars[j] = tmp;
    }
}
