//Simulation Driver
//Laurence Timothy M. Garcia
//CS 3560
//Professor Yu Sun

/***
 * 
 * Main Driver
 *      Runs code and randomizes student and their answers
 * 
***/

import java.util.*;
import java.io.*;

public class SimulationDriver
{
    public static void main(String args[])
    {
        //Initial scanner for prompt
        Scanner kb = new Scanner(System.in);

        System.out.print("How many students are there? ");
        int numOfStudents = kb.nextInt();
        kb.close();

        //List of questions
        QuestionMC q1 = new QuestionMC("What is an interface?", "A. An abstract type", "B. A variable", "C. An integer", "D. An Android APP", "E. A class at CPP", "F. A Videogame");
        QuestionTF q2 = new QuestionTF("Overwatch was created by Riot Games.");
        QuestionMC q3 = new QuestionMC("Who created Stardew Valley?", "A. Valve", "B. ConcernedApe", "C. James Gunn", "D. Me", "E. Dunkey", "F. Mark Zuckerberg");
        QuestionMC q4 = new QuestionMC("Who are the main characters of the Amazing World of Gumball?", "A. Joseph", "B. Darwin", "C. Banana Joe", "D. Gumball", "E. Happy", "F. Steve");
        QuestionTF q5 = new QuestionTF("Apple creates Samsung Phones");
        QuestionTF q6 = new QuestionTF("Batman is based off of a bat.");

        //Students
        HashMap<String, boolean[]> studentArr = new HashMap<String, boolean[]>();   //Used hashmap to ensure each student is a unique id
        for (int i = 0; i < numOfStudents; i++)
        {
            Student student = new Student();

            studentArr.put(student.getID(), student.getAnswer());
        }

        //Question 1
        VotingService voteQ1 = new VotingService(studentArr, q1);
        voteQ1.votingProcessMC();

        //Question 2
        VotingService voteQ2 = new VotingService(studentArr, q2);
        voteQ2.votingProcessTF();

        //Question 3
        VotingService voteQ3 = new VotingService(studentArr, q3);
        voteQ3.votingProcessMC();

        //Question 4
        VotingService voteQ4 = new VotingService(studentArr, q4);
        voteQ4.votingProcessMC();

        //Question 5
        VotingService voteQ5 = new VotingService(studentArr, q5);
        voteQ5.votingProcessTF();

        //Question 6
        VotingService voteQ6 = new VotingService(studentArr, q6);
        voteQ6.votingProcessTF();
    }
}