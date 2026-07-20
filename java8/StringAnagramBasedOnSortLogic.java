package java8.string;

import java.util.Arrays;

public class StringAnagramBasedOnSortLogic {

    public static boolean stringsAnagramCheck(String input1, String input2){

        if(input1!=null && input2!=null){
            char[] charArray1 = input1.toLowerCase().toCharArray();
            char[] charArray2 = input2.toLowerCase().toCharArray();
            //baca
            //acab
            //aabc
            //aabc
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            //o(n log n)
            return charArray1.equals(charArray2);
        }
        return false;
    }

    public static void main(String args[]){


    }

    public static boolean stringAnagramCheckBasedOnCount(String input1, String input2){

        if(input1.length()!=input2.length())
            return false;
        //alphabetics 26 so
        int[] count = new int[26];

        for(int i=0; i< input1.length(); i++){
            count[input1.charAt(i)-'a']++;
            count[input2.charAt(i)- 'a']--;
        }
        for(int c: count){
            if(c!=0){
                return false;
            }
        }
        return true;
    }
}
