package com.develogical;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by ape02 on 11/07/2017.
 */
public class RecentlyUsedTest {

    @Test
    public void NewListShouldBeEmpty() {
        assertThat(new RecentlyUsedList().length(), is(0));
    }

    @Test
    public void AddThingsToList(){
        RecentlyUsedList OurList = new RecentlyUsedList();
        OurList.add("Abdul");
        assertThat(OurList.length(), is(1));
    }

    @Test
    public void retrieveItems(){
        RecentlyUsedList OurList = new RecentlyUsedList();
        OurList.add("Abdul");
        assertThat(OurList.get(0), is("Abdul"));
    }

    @Test
    public void MostRecentItemShoulBeFirst() {
        RecentlyUsedList RecentList = new RecentlyUsedList();
        RecentList.add ("Abdul");
        RecentList.add ("Kamal");
        assertThat(RecentList.get(0), is("Kamal"));
    }

    @Test
    public void CheckAddingDuplicates() {
        RecentlyUsedList duplicates = new RecentlyUsedList();
        duplicates.add("Abdul");
        duplicates.add("Kamal");
        duplicates.add("Abdul");
        assertThat(duplicates.length(), is(2));
        assertThat(duplicates.get(0), is ("Abdul"));
        assertThat(duplicates.get(1), is ("Kamal"));
    }
}