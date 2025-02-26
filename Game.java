public class Game
{
private Level levelOne;
private Level levelTwo;
private Level levelThree;
private boolean bonus = false;
/** Postcondition: All instance variables have been initialized. */
public Game(){
    levelOne = new Level();
    levelTwo = new Level();
    levelThree = new Level();
}
/** Returns true if this game is a bonus game and returns false otherwise */
public boolean isBonus()
{
    return bonus;
}
/** Simulates the play of this Game (consisting of three levels) and updates all relevant
* game data
*/
public void play()
{ 
    reachGoals(true, true, true);
    setPoints(200, 100, 500);
    makeBonus();
}
/** Returns the score earned in the most recently played game, as described in part (a) */
public int getScore()
{
    int p = 0;
    if (levelOne.goalReached() == true) p += levelOne.getPoints();
    else return 0;
    if (levelTwo.goalReached() == true) p += levelTwo.getPoints();
    else{
        if(isBonus()) return p * 3;
        return p;
    }
    if (levelThree.goalReached() == true) p += levelThree.getPoints();
    if (isBonus()) return p * 3;
    return p;
}
/** Simulates the play of num games and returns the highest score earned, as
* described in part (b)
* Precondition: num > 0
*/
public int playManyTimes(int num)
{
    int score = 0;
    for (int i = 0; i < num; i++)
        play();
        int s = getScore();
        if (s > score) score = s;
    return score;
}
// There may be instance variables, constructors, and methods that are not shown.
public void reachGoals(boolean one, boolean two, boolean three){
    if (one) levelOne.reachGoal();
    if (two) levelTwo.reachGoal();
    if (three) levelThree.reachGoal();
}
public void makeBonus(){
    bonus = true;
}
public void setPoints(int one, int two, int three){
    levelOne.setPoints(one);
    levelTwo.setPoints(two);
    levelThree.setPoints(three);
}
}