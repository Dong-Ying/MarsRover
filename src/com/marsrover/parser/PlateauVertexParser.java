package com.marsrover.parser;

import com.marsrover.util.Point;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 2/2/13
 * Time: 10:03 PM
 * To change this template use File | Settings | File Templates.
 */
class PlateauVertexParser{

    public static Point parse(String vertex){
        String[] coordinates = vertex.split(" ");
        int x = Integer.parseInt(coordinates[0]);
        int y = Integer.parseInt(coordinates[1]);
        return new Point(x, y);
    }
}
