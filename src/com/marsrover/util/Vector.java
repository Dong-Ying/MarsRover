package com.marsrover.util;

import com.marsrover.direction.Direction;
import com.marsrover.util.Point;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 2/2/13
 * Time: 8:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class Vector {
    private Point position;
    private Direction direction;

    public Vector(Point position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }


    public void setPosition(Point position) {
        this.position = position;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Point getPosition() {
        return position;
    }

    public Direction getDirection() {
        return direction;
    }

    @Override
    public String toString() {
        return position.toString()+" "+direction.toString();
    }
}
