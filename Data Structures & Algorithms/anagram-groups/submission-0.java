class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        //edge case

        if(strs.length == 0)return null; 

        //brute force
        boolean[] used = new boolean[strs.length];

        List<List<String>> result = new ArrayList<>();
            

        for(int i = 0; i < strs.length; i++){
            
            if(used[i]) continue;

            List<String> group = new ArrayList<>();
            
            String word1 = strs[i]; 
            char[] cur1 = word1.toCharArray();
            Arrays.sort(cur1);

            group.add(word1);
            used[i] = true;

            for(int j = 0; j < strs.length; j++){
                if(used[j]) continue;

                if(j == i){j++;}
                
                String word2 = strs[j];
                char[] cur2 = word2.toCharArray();
                Arrays.sort(cur2);

                if(Arrays.equals(cur1,cur2)){
                    group.add(word2);
                    used[j] = true;
                }
                
            } 

            result.add(group);
            
            
        }

        return result;


    }
}
