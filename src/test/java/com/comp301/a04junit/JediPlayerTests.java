package com.comp301.a04junit;

import static org.junit.Assert.assertTrue;

import com.comp301.a04junit.adventure.*;

import org.junit.Test;

/**
 * Write unit tests for the PlayerImpl class here
 */
public class JediPlayerTests {
    @Test
    public void testConstructor() {
        int i = 0;
        try {
            new PlayerImpl(null, 0, 0);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
            i +=1;
        }
        if (i == 0) {assertTrue(false);}
    }

    @Test
    public void testGetName() {
        Player a = new PlayerImpl("Ethan", 0, 0);
        assertTrue(a.getName() == "Ethan");
    }

    @Test
    public void testGetInventory() {
        Player a = new PlayerImpl("Ethan", 0, 0);
        Item b = new ItemImpl("b");
        a.getInventory().addItem(b);
        assertTrue(!a.getInventory().isEmpty());
    }

    @Test
    public void testGetInventory2() {
        Player a = new PlayerImpl("Ethan", 0, 0);
        Item b = new ItemImpl("b");
        Inventory c = a.getInventory();
        a.getInventory().addItem(b);
        assertTrue(!c.isEmpty());
    }

    @Test
    public void testMoveNorth() {
        Player a = new PlayerImpl("Ethan", 0, 0);
        a.move(Direction.NORTH); a.move(Direction.NORTH);
        assertTrue(a.getPosition().getY() == 2 && a.getPosition().getX() == 0);
    }

    @Test
    public void testMoveSouth() {
        Player a = new PlayerImpl("Ethan", 0, 0);
        a.move(Direction.SOUTH); a.move(Direction.SOUTH);
        assertTrue(a.getPosition().getY() == -2 && a.getPosition().getX() == 0);
    }

    @Test
    public void testMoveEast() {
        Player a = new PlayerImpl("Ethan", 0, 0);
        a.move(Direction.EAST); a.move(Direction.EAST);
        assertTrue(a.getPosition().getX() == 2 && a.getPosition().getY() == 0);
    }

    @Test
    public void testMoveWest() {
        Player a = new PlayerImpl("Ethan", 0, 0);
        a.move(Direction.WEST); a.move(Direction.WEST);
        assertTrue(a.getPosition().getX() == -2 && a.getPosition().getY() == 0);
    }
}
