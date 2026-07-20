package java8.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAnagramIndex {

    public static boolean getAnagramIndexes(String s, String p){


        int[]  pArray = new int[26];

        List<Integer> ans = new ArrayList<>();

        //s= cbaebabacd
        //p = abc

        /*
        p has 3 chars so we need to take 3 window sise and move one by one window like
        cba bae aeb
        if (s < abc ){
            retrun false;
         */
        if(s.length()<p.length())
            return false;
        else
            for(int i = 0; i<p.length(); i++){
                pArray[p.charAt(i) - 'a']++;
                //[1,1,1, 0, 0 ...00]
            }
            for(int i=0; i<s.length()-p.length(); i++){
                int[] WindowArray = new int[26];
                for( int j=i; j < i + p.length(); j++)
                    WindowArray[s.charAt(j)-'a']++;


                    if(Arrays.equals(pArray, WindowArray)){
                        ans.add(i);
                    }


            }




    }
}
