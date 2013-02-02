package com.marsrover.command;

import com.marsrover.main.Rover;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 2/2/13
 * Time: 8:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class MoveForwardCommand implements Command{
    
    private Rover rover;

    public MoveForwardCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.moveForward();
    }
}
