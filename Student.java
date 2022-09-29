/***
 * 
 * Student Class
 *      Holds all information for a single student
 * 
***/

import java.util.Random;

public class Student
{
    Random rand = new Random();

    private String studentID;

    //Have the student call random answer using random bool and random boolean[] function
    private boolean[] answer = new boolean[6];

    public Student()
    {
        studentID = randomID();
        answer = randomAnswer();
    }

    public Student(String id, boolean[] ans)
    {
        studentID = id;
        answer = ans;
    }

    private String randomID()
    {
        int randomNumber = 0;

        for (int i = 0; i < 10; i++)
        {
            randomNumber += rand.nextInt(10);
            randomNumber *= 10;
        }

        return Integer.toString(randomNumber);
    }

    private boolean randomTF()
    {
        int truFal = rand.nextInt(2);
        
        if (truFal == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean[] randomAnswer()
    {
        boolean[] mc = new boolean[answer.length];

        for (int i = 0; i < mc.length; i++)
        {
            mc[i] = randomTF();
        }

        return mc;
    }

    /* Accessor Methods */
    public String getID()
    {
        return studentID;
    }

    public boolean[] getAnswer()
    {
        return answer;
    }

    public void setAnswer(boolean[] mc)
    {
        answer = mc;
    }
}
