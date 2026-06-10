class Solution {
    public boolean isValid(String s) {
        if(s.isEmpty() == true){return false;}

        Stack<Character> st = new Stack<>();


        for(int i = 0; i < s.length(); i++){
            
            char c = s.charAt(i);

            if(c == '(' || c == '[' || c == '{'){
                
                st.push(c);
            
            }else{ //getting closing brackets
               
                if (st.isEmpty()) return false; 

                char open = st.pop();  // pop the top opening bracket since getting closing bracket

                //compare the current closing bracket with opening bracket
                if(c == ')' && open != '(') return false;
                if(c == ']' && open != '[') return false;
                if(c == '}' && open != '{') return false;


            }
            
            


        }

        return st.isEmpty();




    }
}
