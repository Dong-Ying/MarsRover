package com.marsrover.parser;

import com.marsrover.command.Command;
import com.marsrover.command.MoveForwardCommand;
import com.marsrover.command.TurnLeftCommand;
import com.marsrover.command.TurnRightCommand;
import com.marsrover.main.Rover;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 2/2/13
 * Time: 10:41 PM
 * To change this template use File | Settings | File Templates.
 */
class CommandParser {
    
    public static ArrayList<Command> parse(String commandsString, Rover rover){

        ArrayList<Command> commandsList = new ArrayList<Command>();

        for(int i=0; i<commandsString.length(); i++){
            switch (commandsString.charAt(i)){
                case 'l': commandsList.add(new TurnLeftCommand(rover)); break;
                case 'r': commandsList.add(new TurnRightCommand(rover)); break;
                case 'm': commandsList.add(new MoveForwardCommand(rover)); break;
            }
        }

        return commandsList;
    }
    
}
