//Simulation Driver
//Laurence Timothy M. Garcia
//CS 3560
//Professor Yu Sun

import java.util.*;
import java.io.*;

public class SimulationDriver
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("How many students are there? ");
        int numOfStudents = kb.nextInt();
        kb.close();

        //List of questions
        QuestionMC q1 = new QuestionMC("What is an interface?");
        QuestionTF q2 = new QuestionTF("Overwatch was created by Riot Games.");
        QuestionMC q3 = new QuestionMC("Who created Stardew Valley?");
        QuestionMC q4 = new QuestionMC("Who is the main character of the Amazing World of Gumball?");
        QuestionTF q5 = new QuestionTF("Apple creates Samsung Phones");
        QuestionTF q6 = new QuestionTF("Batman is based off of a bat.");

        //Students
        ArrayList<Student> studentArr = new ArrayList<Student>();
        for (int i = 0; i < numOfStudents; i++)
        {
            studentArr.add(new Student());
        }

        //Question 1
        VotingService voteQ1 = new VotingService(studentArr, q1);
        q1.printQuestion();
        q1.printChoice();
        for (int i = 0; i < studentArr.size(); i++)
        {
            voteQ1.addCounter(studentArr.get(i).getMCAnswer());
        }
        voteQ1.submissionResults(voteQ1.getCounter(), q1.getOptions());
        //Randomize for new answers
        for (int i = 0; i < studentArr.size(); i++)
        {
            studentArr.get(i).randomizeAnswer();
        }

        //Question 2
        VotingService voteQ2 = new VotingService(studentArr, q2);
        q2.printQuestion();
        q2.printChoice();
        for (int i = 0; i < studentArr.size(); i++)
        {
            voteQ2.addCounter(studentArr.get(i).getTFAnswer());
        }
        voteQ2.submissionResults(voteQ2.getCounter(), q2.getOptions());
        //Randomize for new answers
        for (int i = 0; i < studentArr.size(); i++)
        {
            studentArr.get(i).randomizeAnswer();
        }
    }
}