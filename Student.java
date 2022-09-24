public class Student
{
    private String studentID;

    private String mcAnswer;
    private int tfAnswer;

    public Student(String id, String mc)
    {
        studentID = id;
        mcAnswer = mc;
    }

    public Student(String id, int tf)
    {
        studentID = id;
        tfAnswer = tf;
    }

    public String getID()
    {
        return studentID;
    }

    public String getMCAnswer()
    {
        return mcAnswer;
    }

    public int getTFAnswer()
    {
        return tfAnswer;
    }

    public void setMCAnswer(String mc)
    {
        mcAnswer = mc;
    }

    public void setTFAnswer(int tf)
    {
        tfAnswer = tf;
    }
}
