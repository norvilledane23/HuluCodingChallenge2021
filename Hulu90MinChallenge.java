/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hulu90minchallenge;

import java.io.*;
import java.net.*;

public class Hulu90MinChallenge {
    public static void main(String[] args) throws Exception{
        String show_name = "The Golden Girls";
        String showID = "";
        URL searchURL = new URL("http://api.tvmaze.com/singlesearch/shows?q=" + show_name);
        BufferedReader reader = new BufferedReader(new InputStreamReader(searchURL.openStream()));
        
        String inputLine;
        inputLine = reader.readLine();
        showID = inputLine.substring(inputLine.indexOf(":")+1,inputLine.indexOf(","));
        
        URL castURL = new URL("http://api.tvmaze.com/shows/" + showID + "/cast");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(castURL.openStream()));
        while ((inputLine = reader2.readLine()) != null){  
            if(inputLine.contains("Kevin Bacon")){
                System.out.println("Bacon");
            }
            else{
                System.out.println("Eggs");
            }
        }
        reader.close();
        reader2.close();
    } 
}
