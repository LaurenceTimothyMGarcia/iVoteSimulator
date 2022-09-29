/***
 * 
 * Question Interface
 * 
***/

public interface Question
{
    //Prints the question for display for the user
    public void printQuestion();

    //Displays the choices for the user
    public void printChoice();

    //Accessor Methods
    public String getChoice(int numInArr);
    public String[] getOptions();
}
