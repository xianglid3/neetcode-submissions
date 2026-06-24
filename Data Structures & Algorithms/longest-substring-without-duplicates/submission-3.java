class Solution {
    public int lengthOfLongestSubstring(String s) {
  
        HashSet<Character> result = new HashSet<>();

        int left = 0;
        int maxLen = 0;

        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);


            // abba -> 2
            //   ^
            //    ^ 
            while(result.contains(c)){
                result.remove(s.charAt(left));
                left++;
            }

            result.add(c);

            maxLen = Math.max(maxLen, result.size());

        }


        return maxLen;

    }
}
