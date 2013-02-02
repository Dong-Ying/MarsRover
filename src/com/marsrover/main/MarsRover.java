package com.marsrover.main;

import com.marsrover.command.Command;
import com.marsrover.parser.UserInputParser;
import com.marsrover.user_input.UserInput;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 2/2/13
 * Time: 9:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class MarsRover{
    Plateau plateau;
    HashMap<Rover, ArrayList<Command>> rovers;

    public MarsRover(Plateau plateau, HashMap<Rover, ArrayList<Command>> rovers) {
        this.plateau = plateau;
        this.rovers = rovers;
    }

    public static void main(String args[]) throws IOException {

        String userInput = UserInput.getUserInput();
        MarsRover marsRover = UserInputParser.parse(userInput);

        Iterator iter = marsRover.rovers.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry entry = (Map.Entry) iter.next();
            ArrayList<Command> commands = (ArrayList<Command>) entry.getValue();

            for(Command command : commands) {
                command.execute();
            }

        }

        for(Object rover : marsRover.rovers.keySet()){
            System.out.println(((Rover)rover).toString());
        }

    }

}
