package com.comp301.a04junit;

import static org.junit.Assert.assertTrue;

import com.comp301.a04junit.adventure.Item;
import com.comp301.a04junit.adventure.ItemImpl;
import com.comp301.a04junit.adventure.Inventory;
import com.comp301.a04junit.adventure.InventoryImpl;

import org.junit.Test;

/**
 * Write unit tests for the InventoryImpl class here
 */
public class JediInventoryTests {
    @Test
    public void testConstructor() {
        Inventory a = new InventoryImpl();
        assertTrue(a.getNumItems() == 0);
    }

    @Test
    public void testIsEmptyEmpty() {
        Inventory a = new InventoryImpl();
        assertTrue(a.isEmpty());
    }

    @Test
    public void testIsEmptyNotEmpty() {
        Inventory a = new InventoryImpl();
        Item b = new ItemImpl("name");
        a.addItem(b);
        assertTrue(!a.isEmpty());
    }

    @Test
    public void testAddItem() {
        Inventory a = new InventoryImpl();
        Item b = new ItemImpl("name");
        a.addItem(b);
        assertTrue(a.getNumItems() == 1);
    }

    @Test
    public void testAddItemMultiple() {
        Inventory a = new InventoryImpl();
        Item b = new ItemImpl("name");
        Item c = new ItemImpl("i");
        Item d = new ItemImpl("o");
        a.addItem(b);
        a.addItem(c);
        a.addItem(d);
        assertTrue(a.getNumItems() == 3);
    }

    @Test
    public void testRemoveOne() {
        Inventory a = new InventoryImpl();
        Item b = new ItemImpl("name");
        Item c = new ItemImpl("i");
        Item d = new ItemImpl("o");
        a.addItem(b);
        a.addItem(c);
        a.addItem(d);
        a.removeItem(b);
        assertTrue(a.getNumItems() == 2);
    }

    @Test
    public void testRemoveAll() {
        Inventory a = new InventoryImpl();
        Item b = new ItemImpl("name");
        Item c = new ItemImpl("i");
        Item d = new ItemImpl("o");
        a.addItem(b);
        a.addItem(c);
        a.addItem(d);
        a.removeItem(b);
        a.removeItem(c);
        a.removeItem(d);
        assertTrue(a.isEmpty());
    }

    @Test
    public void testClear() {
        Inventory a = new InventoryImpl();
        Item b = new ItemImpl("name");
        Item c = new ItemImpl("i");
        Item d = new ItemImpl("o");
        a.addItem(b);
        a.addItem(c);
        a.addItem(d);
        a.clear();
        assertTrue(a.isEmpty());
    }

    @Test
    public void testTransferFrom() {
        Inventory a = new InventoryImpl();
        Item b = new ItemImpl("name");
        Item c = new ItemImpl("i");
        Item d = new ItemImpl("o");
        a.addItem(b);
        a.addItem(c);
        a.addItem(d);
        Inventory ab = new InventoryImpl();
        Item z = new ItemImpl("ok");
        ab.addItem(z);
        a.transferFrom(ab);
        assertTrue(a.getNumItems() == 4 && ab.isEmpty());
    }
}
