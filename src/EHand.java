public class EHand extends Equipe{

    public EHand(String name) {
        super(name);
    }
    @Override
    int calculNbPoints(Match match){
        int res;
        if (match.ScoreAdversaire > match.scoreEquipe){
            res = 0;
        }
        else if (match.ScoreAdversaire == match.scoreEquipe){
            res = 1;
        }
        else res = 2;
        return res;
    }
}
