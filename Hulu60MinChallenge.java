package hulu60minchallenge;

import java.io.*;
import java.util.*;
import java.net.*;

public class Hulu60MinChallenge{
    public static void main(String[] args) throws Exception{
        Scanner scnr = new Scanner(System.in);
        String imgURL  = "";
        int comic_number = 1608;
        
        URL comicURL = new URL("https://xkcd.com/" + comic_number + "/");
        BufferedReader reader = new BufferedReader(new InputStreamReader(comicURL.openStream()));

        String inputLine;
        while ((inputLine = reader.readLine()) != null){
            if(inputLine.contains("https://imgs.xkcd.com/comics/")){
                imgURL = inputLine;
            }
        }
        reader.close();
        
        imgURL = imgURL.substring(38);
        
        if(imgURL.equals("https://imgs.xkcd.com/comics/")){
            System.out.println("No Image Found");
        }
        System.out.println(imgURL);
    }
    
}
