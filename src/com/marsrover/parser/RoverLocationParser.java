package com.marsrover.parser;

import com.marsrover.direction.*;
import com.marsrover.util.Point;
import com.marsrover.util.Vector;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 2/2/13
 * Time: 10:08 PM
 * To change this template use File | Settings | File Templates.
 */
class RoverLocationParser {
    
    public static Vector parse(String roverLocation){
        
        String[] temp = roverLocation.split(" ");

        int x = Integer.parseInt(temp[0]);
        int y = Integer.parseInt(temp[1]);
        Point position = new Point(x, y);

        Direction direction = null;
        switch (temp[2].charAt(0)){
            case 'e': direction = new East(); break;
            case 's': direction = new South(); break;
            case 'w': direction = new West(); break;
            case 'n': direction = new North(); break;
        }
        
        return new Vector(position, direction);
    } 
}

