package com.marsrover.direction;

import com.marsrover.util.Point;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 2/2/13
 * Time: 8:03 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Direction {
    
    public Direction turnLeft();
    public Direction turnRight();
    public Point moveForward(Point originalPosition);
    public String toString();
}
