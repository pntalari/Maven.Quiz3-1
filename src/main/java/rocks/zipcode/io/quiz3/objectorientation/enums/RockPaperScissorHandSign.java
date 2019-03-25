package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK("PAPER", "SCISSOR"),
    PAPER("SCISSOR","ROCK"),
    SCISSOR("ROCK","PAPER");

    private String winnerSign;
    private String looserSign;

    RockPaperScissorHandSign(String winnerSign, String looserSign) {
        this.winnerSign = winnerSign;
        this.looserSign = looserSign;
    }

    public RockPaperScissorHandSign getWinner() {
        return valueOf(winnerSign);
    }

    public RockPaperScissorHandSign getLoser() {
        return valueOf(looserSign);
    }
}
