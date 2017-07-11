package com.develogical;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ape02 on 11/07/2017.
 */
public class RecentlyUsedList {

    private List<String> list;

    public RecentlyUsedList() {
        this.list = new ArrayList<String>();
    }


    public int length()
    {
        return list.size();
    }

    public void add(String number){
        if (list.contains(number)) {
            list.remove(number);
        }

        list.add(0,number);
    }


    public String get(int i) {
        return list.get(i);
    }
}
