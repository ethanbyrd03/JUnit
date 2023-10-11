package com.comp301.a04junit;

import static org.junit.Assert.assertTrue;

import com.comp301.a04junit.adventure.Item;
import com.comp301.a04junit.adventure.ItemImpl;

import org.junit.Test;

/**
 * Write unit tests for the ItemImpl class here
 */
public class AdeptItemTests {
    @Test
    public void testGetName() {
        String testName = "fungus";
        Item test = new ItemImpl(testName);
        assertTrue(test.getName() == testName);
    }

    @Test
    public void testEqualsNotEqual() {
        String test1Name = "fungus";
        String test2Name = "patch";
        Item test1 = new ItemImpl(test1Name);
        Item test2 = new ItemImpl(test2Name);
        assertTrue(!test1.equals(test2));
    }

    @Test
    public void testEqualsIsEqual() {
        String test1Name = "fungus";
        Item test1 = new ItemImpl(test1Name);
        Item test2 = new ItemImpl(test1Name);
        assertTrue(test1.equals(test2));
    }
}
