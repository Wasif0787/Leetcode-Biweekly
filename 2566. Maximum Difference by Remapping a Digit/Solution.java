class Solution {
    public int minMaxDifference(int num) {
        int mini=Integer.MAX_VALUE,maxi=Integer.MIN_VALUE;
        String str=String.valueOf(num);
        for(int i=0;i<=9;i++){
            StringBuilder tmp=new StringBuilder(str);
            StringBuilder temp=new StringBuilder(str);
            for(int j=0;j<tmp.length();j++){
                if(tmp.charAt(j)-'0'==i){
                    tmp.setCharAt(j, '9');
                }
                if(temp.charAt(j)-'0'==i)
                    temp.setCharAt(j, '0');
            }
            String s1=tmp.toString();
            String s2 = temp.toString();
            maxi=Math.max(Integer.parseInt(s1),maxi);
            mini=Math.min(Integer.parseInt(s2),mini);
        }
        return maxi-mini;
    }
}
