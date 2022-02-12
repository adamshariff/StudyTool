package model;//package line

//Import
import java.io.File;                  //Used for files
import java.io.FileNotFoundException; //If file not found
import java.util.ArrayList;           //Holds questions as an array
import java.util.Scanner;             //Used to read question list file

/* Title: QuestionList
 * Version: 1.0
 * Author: Adam Shariff
 * Last Modified: 29/12/21
 * Description: This class creates a list of questions. This list can be read form a file or start from a blank list.
 * List can be edited and can overwrite the file read from.
 */
public class QuestionList {

    //Instance variable
    ArrayList<Question> qList;

    /* @Constructor: Creates a Question list from a file
     * @param fileName: Holds the name of the file to open
     */
    public QuestionList(String fileName) throws FileNotFoundException {
        //Reads data from file
        readFile(fileName);
    }//constructor

    /* Title: readFile
     * Description: Reads all questions and answers from file and stores them into Array list
     */
    private void readFile(String fileName) throws FileNotFoundException {
        Scanner c;     //Reads file
        String[] line; //Holds line

        //Opens file and creates array list
        //Note: should create try catch for if file does not exist\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        qList= new ArrayList<>();
        c = new Scanner(new File(fileName));

        //Loops until end of file
        while(c.hasNext()){

            //Reads line from file and determines which question type is to be stored into list or if there is a blank line
            line=c.nextLine().split(",");
            if(line[0].equalsIgnoreCase("M")){//Adds Multi choice question
                qList.add(new Question(line[1],line[2],line[3],line[4],line[5]));
            }
            else if(line[0].equalsIgnoreCase("S")){//Adds Short answer question
                qList.add(new Question(line[1],line[2]));
            }
            else{//Breaks if there is misprint in file or a break in lines
                break;
            }
        }//loop
        //Closes file
        c.close();
    }//readFile

    /* @Constructor: Creates a blank Question list
     */
    public QuestionList(){
        //Creates blank list
        qList= new ArrayList<>();
    }//Constructor

}//QuestionList
