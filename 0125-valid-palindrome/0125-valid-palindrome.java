class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String str="";
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='0' && ch<='9')) {
                str=str+ch;
            }
        }
        int start=0;
        int end=str.length()-1;
        while(start<end) {
            if(str.charAt(start)!=str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}