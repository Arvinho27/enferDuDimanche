public class Efutsal extends EFoot{

    public Efutsal(String name) {
        super(name);
    }
    @Override
    int calculNbPoints(Match match){
        int res = super.calculNbPoints(match);
        if (match.scoreEquipe >= 5){
            res += 1;
        }
        return res;
    }
}
