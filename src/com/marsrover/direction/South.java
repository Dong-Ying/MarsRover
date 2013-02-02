package com.marsrover.direction;

import com.marsrover.util.Point;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 2/2/13
 * Time: 8:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class South implements Direction{
    @Override
    public Direction turnLeft() {
        return new East();
    }

    @Override
    public Direction turnRight() {
        return new West();
    }

    @Override
    public Point moveForward(Point originalPosition) {
        return new Point(originalPosition.getX(), originalPosition.getY()-1);
    }

    public String toString(){
        return "S";
    }
}
