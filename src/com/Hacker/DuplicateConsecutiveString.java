package com.Hacker;

public class DuplicateConsecutiveString {

    public static void main(String[] args) {
        DuplicateConsecutiveString duplicateConsecutiveString = new DuplicateConsecutiveString();
        String str = "aaassbsaddkkee";
        String newString = duplicateConsecutiveString.removeDupConsecutive(str.toCharArray());
        System.out.println(newString);

    }

    public String removeDupConsecutive(char[] c){
        StringBuilder newStr = new StringBuilder();
        if(c.length<2){
            return c.toString();
        }else{
            int i = 1;
            for (; i < c.length; i++)
            {
                if (c[i-1] != c[i])
                {
                    newStr.append(c[i-1]);
                }
            }
            newStr.append(c[i-1]);

        }
        return newStr.toString();
    }
}
