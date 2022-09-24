public class Student
{
    private String studentID;

    private String mcChoice;
    private int tfChoice;

    public void Student(String id, String mc)
    {
        studentID = id;
        mcChoice = mc;
    }

    public void Student(String id, int tf)
    {
        studentID = id;
        tfChoice = tf;
    }


}
