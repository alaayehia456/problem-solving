public class longest {
    class Solution {
        public String longestCommonPrefix(String[] strs) {

            if(strs.length == 0)
                return "";

            String pre=strs[0];


            for(int i=0;i<strs.length;i++){

                String curentString=strs[i];


                while(curentString.indexOf(pre) != 0){

                    pre=pre.substring(0,pre.length() -1 );



                }

            }

            return pre;
        }
    }
}
