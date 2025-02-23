class Solution {
  //tC:O(n) //sc: O(n)
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length != pattern.length()) {
            return false;
        }
        Map<Object, Integer> map = new HashMap<>();
        for(Integer i = 0; i < words.length; i++) {
            if(map.put(pattern.charAt(i), i) != map.put(words[i], i)) {
                return false;
            }
        }
        return true;
    }
}
