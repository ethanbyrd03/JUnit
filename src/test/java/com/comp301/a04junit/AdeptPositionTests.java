package com.comp301.a04junit;

import static org.junit.Assert.assertTrue;

import com.comp301.a04junit.adventure.Direction;
import com.comp301.a04junit.adventure.Position;
import com.comp301.a04junit.adventure.PositionImpl;

import org.junit.Test;

/**
 * Write unit tests for the PositionImpl class here
 */
public class AdeptPositionTests {
    @Test
    public void testPositionXY() {
        int testX = 1;
        int testY = 2;
        Position testPos = new PositionImpl(testX, testY);
        testX = 0;
        testY = 0;
        assertTrue((testPos.getX() == 1) && (testPos.getY() == 2));
    }

    @Test
    public void testPositionNorth() {
        int testX = 1;
        int testY = 2;
        Position testPos = new PositionImpl(testX, testY);
        assertTrue((testPos.getNeighbor(Direction.NORTH).getY() == testPos.getY() + 1) && (testPos.getNeighbor(Direction.NORTH).getX() == testPos.getX()));
    }

    @Test
    public void testPositionSouth() {
        int testX = 1;
        int testY = 2;
        Position testPos = new PositionImpl(testX, testY);
        assertTrue((testPos.getNeighbor(Direction.SOUTH).getY() == testPos.getY() - 1) && (testPos.getNeighbor(Direction.SOUTH).getX() == testPos.getX()));
    }

    @Test
    public void testPositionEast() {
        int testX = 1;
        int testY = 2;
        Position testPos = new PositionImpl(testX, testY);
        assertTrue((testPos.getNeighbor(Direction.EAST).getX() == testPos.getX() + 1) && (testPos.getNeighbor(Direction.EAST).getY() == testPos.getY()));
    }

    @Test
    public void testPositionWest() {
        int testX = 1;
        int testY = 2;
        Position testPos = new PositionImpl(testX, testY);
        assertTrue((testPos.getNeighbor(Direction.WEST).getX() == testPos.getX() - 1) && (testPos.getNeighbor(Direction.WEST).getY() == testPos.getY()));
    }
}
