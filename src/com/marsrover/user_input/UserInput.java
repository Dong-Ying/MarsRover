package com.marsrover.user_input;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 2/2/13
 * Time: 9:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserInput{
    
    public static String getUserInput() throws IOException {
        
        StringBuffer userInput = new StringBuffer();

        System.out.println ( "Please input and end it by entering \"stop\":" );

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String temp;
        while(!((temp = bufferedReader.readLine()).equalsIgnoreCase("stop"))){

            userInput.append(temp.trim().toLowerCase()).append("\n");
        }
        return new String(userInput);
    }
}









