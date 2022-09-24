import java.util.Random;

public class Student
{
    Random rand = new Random();

    private String studentID;

    //Have the student call random answer using random bool and random boolean[] function
    private boolean[] mcAnswer = new boolean[6];
    private boolean tfAnswer;

    public Student()
    {
        studentID = randomID();
        mcAnswer = randomMC();
        tfAnswer = randomTF();
    }

    public Student(String id, boolean[] mc, boolean tf)
    {
        studentID = id;
        mcAnswer = mc;
        tfAnswer = tf;
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

    private boolean[] randomMC()
    {
        boolean[] mc = new boolean[mcAnswer.length];

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

    public boolean[] getMCAnswer()
    {
        return mcAnswer;
    }

    public boolean getTFAnswer()
    {
        return tfAnswer;
    }

    public void setMCAnswer(boolean[] mc)
    {
        mcAnswer = mc;
    }

    public void setTFAnswer(boolean tf)
    {
        tfAnswer = tf;
    }

    public void randomizeAnswer()
    {
        mcAnswer = randomMC();
        tfAnswer = randomTF();
    }
}
