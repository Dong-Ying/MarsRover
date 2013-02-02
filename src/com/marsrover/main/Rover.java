/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 2/2/13
 * Time: 7:52 PM
 * To change this template use File | Settings | File Templates.
 */

package com.marsrover.main;

import com.marsrover.util.Vector;

public class Rover {

    private Vector roverLocation;

    public Rover(Vector roverLocation) {
        this.roverLocation = roverLocation;
    }

    public void turnLeft(){
        roverLocation.setDirection(roverLocation.getDirection().turnLeft());
    }

    public void turnRight() {
        roverLocation.setDirection(roverLocation.getDirection().turnRight());
    }

    public void moveForward() {
        roverLocation.setPosition(roverLocation.getDirection().moveForward(roverLocation.getPosition()));
    }
    
    public String toString(){
        return roverLocation.toString();
    }

}
