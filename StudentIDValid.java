/***
 * 
 * Unique Student ID Validation
 *      Validates the student id, if the same it just places the students answer instead of creating a new student
 * 
***/

import java.util.*;

public class StudentIDValid 
{
    //ID Validation
    public void reinputAnswer(ArrayList<Student> studList, Student stud)
    {
        for (int i = 0; i < studList.size(); i++)
        {
            if (studList.get(i).getID() == stud.getID())
            {
                studList.get(i).setMCAnswer(stud.getMCAnswer());
                studList.get(i).setTFAnswer(stud.getTFAnswer());
                break;
            }
        }
    }
}
