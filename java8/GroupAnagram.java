package java8.string;

import java.util.*;

public class GroupAnagram {

    public static boolean isGroupAnagram(String[] stringsGroup){
        /*
        * ["eat", "tea", "tan", "ate", "nat", "bat"}
        * output: [["eat","tea", "ate"], ["tan", "nat"], ["bat"]]
        * i will sort then same words keep one new array*/
        Map<String, List<String>> dataMap = new HashMap<>();

        for(String data: stringsGroup){
            char[] dataArray = data.toLowerCase().toCharArray();
            //eat, tea, tan
            Arrays.sort(dataArray);
            //aet, aet, ant
            String arrayDataInString = new String(dataArray);
            //aet, aet, ant  - so we can not keep duplicate key so we should not override
            dataMap.putIfAbsent(arrayDataInString, new ArrayList());
            //aet - eat tea
            //ant - tan nat
            dataMap.get(arrayDataInString).add(data);

            //
        }

        return false;
    }
    public static void main(String[] args) {

    }
}
