public interface Question
{
    //Prints the question for display for the user
    public void PrintQuestion();

    //Displays the choices for the user
    public void PrintChoice();

    //Counts how many times a student selected that number
    public void AddCounter();

    //Accessor Methods
    public String GetChoice(int numInArr);
    public int GetCounter(int numInArr);
}
