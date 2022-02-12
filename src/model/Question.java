package model;//Package line

/* Title: Question
 * Version: 1.0
 * Author: Adam Shariff
 * Last Modified: 20/12/21
 * Description: This class is meant to represent a question object. This object can be of two types.
 * Type one is short answer which is denoted by a 0. This question type requires just a question and its answer.
 * The second type is multiple choice and is denoted by 1. This question requires the same as a short answer
 *  question as well as three other fake answers.
 */
public class Question {

    //Instance variables
    String question;      //Holds the question
    int qType;            //Holds type of question
    String answer;        //Holds the answer to the question
    String [] fakeAnswer; //Holds all the fake answers

    /* @Constructor
     * Description: This creates a multiple choice question
     * @param question: Holds the question
     * @param answer: Holds the answer to the question
     * @param f1: Holds the first fake answer
     * @param f2: Holds the second fake answer
     * @param f3: Holds the third fake answer
     */
    public Question(String question, String answer, String f1, String f2, String f3){

        //Initializes fake answer
        fakeAnswer= new String[3];

        //Sets values
        this.question=question;
        qType=1;
        this.answer=answer;
        fakeAnswer[0]=f1;
        fakeAnswer[1]=f2;
        fakeAnswer[2]=f3;
    }//constructor

    /* @Constructor
     * Description: This creates a short answer question
     * @param question: Holds the question
     * @param answer: Holds the answer to the question
     */
    public Question(String question, String answer){

        //Set values
        this.question=question;
        qType=0;
        this.answer=answer;
    }//constructor
}//Question
