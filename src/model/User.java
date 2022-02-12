package model;//package line

import java.io.File;                   //Used for file operations
import java.io.FileNotFoundException;  //Error when trying to read user data file
import java.io.IOException;            //Error when creating user data file
import java.util.ArrayList;            //Holds all question lists
import java.util.Scanner;              //Used to read from files

/* Title: User
 * Version: 1.0
 * Author: Adam Shariff
 * Last Modified: 29/12/21
 * Description: This class creates or reads user data from file. It updates user data
 */
public class User {

    ArrayList<String> lists;
    //@Constructor: Reads or creates user file
    public User() {
        readFile();
    }//constructor

    public void readFile()  {
        Scanner c; //Used to read from file
        File file; //Holds user data file

        //Creates list and user file
        lists = new ArrayList<>();
        file= new File("User.txt");

        //Checks if user data exists
        //Note: need to make proper error system and try/catch for reading file\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        if(file.exists()) {//If data exits opens file
            //Tries to open user file
            try {
                c = new Scanner(file);
            } catch (FileNotFoundException e) { //Catches error when opening user file and exits file
                System.out.println("Error when reading file");
                return;
            }
        }
        else{//Else creates file
            //Creates new user data file and exits method
            try {
                System.out.println("Created user data" + file.createNewFile());
            } catch(IOException e){
                System.out.println("Error Creating User data");
            }
            return;
        }

        //Reads all question lists and adds to list
        while(c.hasNext()){
            lists.add(c.nextLine());
        }//loop
    }//readFile
}//User
