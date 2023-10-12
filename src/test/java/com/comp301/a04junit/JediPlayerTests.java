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
        try {
            new PlayerImpl(null, 0, 0);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testGetName() {
        Player a = new PlayerImpl("Ethan", 0, 0);
        assertTrue(a.getName() == "Ethan");
    }

    @Test
    public void testMove() {
        Player a = new PlayerImpl("Ethan", 0, 0);
        int x = 0;
        int y = 0;
        a.move(Direction.NORTH);
        y += 1;
        a.move(Direction.EAST);
        x += 1;
        a.move(Direction.NORTH);
        y += 1;
        a.move(Direction.SOUTH);
        y -= 1;
        Position current = new PositionImpl(x, y);
        assertTrue((a.getPosition().getX() == x) && (a.getPosition().getY() == y));
    }
}
