package com.marsrover.parser;

import com.marsrover.command.Command;
import com.marsrover.main.MarsRover;
import com.marsrover.main.Plateau;
import com.marsrover.main.Rover;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 2/2/13
 * Time: 9:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserInputParser{
    
    public static MarsRover parse(String userInput){

        Plateau plateau;
        HashMap<Rover, ArrayList<Command>> roverInfo = new HashMap<Rover, ArrayList<Command>>();
        
        String[] inputArray = userInput.split("\n");

        plateau = new Plateau(PlateauVertexParser.parse(inputArray[0]));
        
        for(int i = 1; i < inputArray.length; i+=2){
           Rover rover = new Rover(RoverLocationParser.parse(inputArray[i]));
           ArrayList<Command> commands = CommandParser.parse(inputArray[i+1], rover);
           roverInfo.put(rover, commands);
        }
        
        return new MarsRover(plateau, roverInfo);
    }
}
