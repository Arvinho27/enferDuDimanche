public class Championnat {
    private EFoot eFoot;
    private EHand eHand;
    private EFutsal EFutsal;
    private EVolley eVolley;
    private ERugby eRugby;
    private final Match match=new Match();

    public Championnat() {
    }

    public EFoot geteFoot() {
        return eFoot;
    }

    public void seteFoot(EFoot eFoot) {
        this.eFoot = eFoot;
    }

    public EHand geteHand() {
        return eHand;
    }

    public void seteHand(EHand eHand) {
        this.eHand = eHand;
    }

    public EFutsal getEFutsal() {
        return EFutsal;
    }

    public void setEFutsal(EFutsal EFutsal) {
        this.EFutsal = EFutsal;
    }

    public EVolley geteVolley() {
        return eVolley;
    }

    public void seteVolley(EVolley eVolley) {
        this.eVolley = eVolley;
    }

    public ERugby geteRugby() {
        return eRugby;
    }

    public void seteRugby(ERugby eRugby) {
        this.eRugby = eRugby;
    }

    public void entrerScore(Sport sport, int scoreEquipe, int scoreAdversaire) {
        match.majScore(scoreEquipe,scoreAdversaire);
        switch (sport) {
            case FOOT: {
                if (geteFoot() == null){
                    seteFoot(new EFoot(sport.getLabel()));
                }
                eFoot.majSuiteAUnMatch(match);
                break;
            }
            case HAND: {
                if (geteHand() == null){
                    seteHand(new EHand(sport.getLabel()));
                }
                eHand.majSuiteAUnMatch(match);
                break;
            }
            case FUTSAL: {
                if (getEFutsal() == null){
                    setEFutsal(new EFutsal(sport.getLabel()));
                }
                EFutsal.majSuiteAUnMatch(match);
                break;
            }
            case VOLLEY: {
                if (geteVolley() == null){
                    seteVolley(new EVolley(sport.getLabel()));
                }
                eVolley.majSuiteAUnMatch(match);
                break;
            }
            case RUGBY: {
                if (geteRugby() == null){
                    seteRugby(new ERugby(sport.getLabel()));
                }
                eRugby.majSuiteAUnMatch(match);
                break;
            }
            default: {
                System.out.println("Saisie KO : sport non pris en charge !");
                break;
            }
        }
    }

    public String restituerResChampionnat(){
        String res = "";
        if (geteHand() != null)
        {
            res+= eHand.restituerResultat();
        }
        if (geteFoot() != null)
        {
            res+= "\n"+eFoot.restituerResultat();
        }
        if (getEFutsal() != null)
        {
            res+= "\n"+EFutsal.restituerResultat();
        }
        if (geteRugby() != null)
        {
            res+= "\n"+eRugby.restituerResultat();
        }
        if (geteVolley() != null)
        {
            res+= "\n"+eVolley.restituerResultat();
        }
        return  res;
    }
}
