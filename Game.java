public class Game
{
private Level levelOne;
private Level levelTwo;
private Level levelThree;
/** Postcondition: All instance variables have been initialized. */
public Game(){
    levelOne = new Level();
    levelTwo = new Level();
    levelThree = new Level();
}
/** Returns true if this game is a bonus game and returns false otherwise */
public boolean isBonus()
{
    return true;
}
/** Simulates the play of this Game (consisting of three levels) and updates all relevant
* game data
*/
public void play()
{ /* implementation not shown */ }
/** Returns the score earned in the most recently played game, as described in part (a) */
public int getScore()
{
    int p = 0;
    if (levelOne.goalReached() == true) p += levelOne.getPoints();
    if (levelTwo.goalReached() == true) p += levelTwo.getPoints();
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
        s = getScore();
        if (s > score) score = s;
    return score;
}
// There may be instance variables, constructors, and methods that are not shown.
}