package com.example.problems.dpk01_Revert_String;

public class DPK01_impl_4 {


    public static String revert(String input) {
        if (null != input){
            StringBuilder result = new StringBuilder();
            for (int i = input.length()-1; i >= 0 ; i--) {
                result.append(input.toCharArray()[i]);
            }
            return result.toString();
        }

        return null;
    }
}
