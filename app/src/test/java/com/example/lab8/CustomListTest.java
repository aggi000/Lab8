package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }
    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }
    @org.junit.Test
    public void hasCityTest(){
        list.addCity(new City("Edmonton","AB"));
        assertTrue(list.hasCity(new City("Edmonton","AB")));
        assertFalse(list.hasCity(new City("Hrid","IN")));
    }

    @org.junit.Test
    public void deleteCityTest(){
        list.addCity(new City("Edmonton","AB"));
        list.deleteCity(new City("Edmonton","AB"));
        assertFalse(list.hasCity(new City("Edmonton","AB")));
    }

    @org.junit.Test
    public void countCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Edmonton","AB"));
        assertEquals(list.countCities(),listSize+1);
    }


}
