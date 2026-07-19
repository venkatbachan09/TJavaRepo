package corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {

    public static void main(String[] args) {
        List<NeedToSortClass> needTosortList = new ArrayList<>();
        NeedToSortClass e= new NeedToSortClass();
        e.setId(30);
        e.setId(34);
        e.setId(32);

        NeedToSortClass e2= new NeedToSortClass();

        e2.setId(34);
        needTosortList.add(e);
        needTosortList.add(e2);

        Collections.sort(needTosortList);

        System.out.println(needTosortList);



    }
}
