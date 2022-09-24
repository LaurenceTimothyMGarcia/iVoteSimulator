public class Student
{
    private String studentID;

    private boolean[] mcAnswer;
    private boolean tfAnswer;

    public Student(String id, boolean[] mc)
    {
        studentID = id;
        mcAnswer = mc;
    }

    public Student(String id, boolean tf)
    {
        studentID = id;
        tfAnswer = tf;
    }

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
}
