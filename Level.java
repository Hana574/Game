public class Level{
    private boolean goal = false;
    private int points = 0;
    public boolean goalReached()
    {
        return goal;
    }
    public int getPoints()
    {
        return points;
    }
    public void reachGoal(){
        goal = true;
    }
    public void setPoints(int p){
        points = p;
    }
}