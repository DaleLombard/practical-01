package footyscore;

public class FootyScore {
    final private Pair<String, Integer> goals = new Pair<>("goals",0);
    final private Pair<String, Integer> behinds = new Pair<>("behinds",0);
    final private int score = 0;

    public int getPoints() {
        return score;
    }
    public boolean kickGoal() {
        goals.setAt2() = goals.getValue() + 1;
    }
    public boolean kickBehind() {

    }
    public String sayScore() {

    }
    private boolean inFrontOf(FootyScore versusTeam) {

    }
}
