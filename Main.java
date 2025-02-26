public class Main{
    public static void main(String[] args){
        Game g = new Game();
        g.reachGoals(true, true, true);
        g.makeBonus();
        g.setPoints(200, 100, 500);
        System.out.println(g.getScore());
        Game h = new Game();
        h.reachGoals(true, true, false);
        h.setPoints(200, 100, 500);
        System.out.println(h.getScore());
        Game i = new Game();
        i.reachGoals(true, false, true);
        i.setPoints(200, 100, 500);
        i.makeBonus();
        System.out.println(i.getScore());
        Game j = new Game();
        j.reachGoals(false, true, true);
        j.setPoints(200, 100, 500);
        System.out.println(j.getScore());
        System.out.println(g.playManyTimes(4));
    }
}