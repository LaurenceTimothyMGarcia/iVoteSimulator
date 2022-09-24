public interface Question
{
    //Prints the question for display for the user
    public void PrintQuestion();

    //Displays the choices for the user
    public void PrintChoice();

    //Accessor Methods
    public String GetChoice(int numInArr);
}
