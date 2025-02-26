public class Level{
    private boolean goal = false;
    public boolean goalReached()
    {
        return goal;
    }
    public int getPoints()
    {
        return 1;
    }
    public void reachGoal(){
        goal = true;
    }
}