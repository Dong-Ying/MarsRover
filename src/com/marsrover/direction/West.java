package com.marsrover.direction;

import com.marsrover.util.Point;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 2/2/13
 * Time: 8:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class West implements Direction{
    @Override
    public Direction turnLeft() {
        return new South();
    }

    @Override
    public Direction turnRight() {
        return new North();
    }


    @Override
    public Point moveForward(Point originalPosition) {
        return new Point(originalPosition.getX()-1, originalPosition.getY());
    }

    public String toString(){
        return "W";
    }
}
