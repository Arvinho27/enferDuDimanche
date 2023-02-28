public class Championnat {
    private EFoot eFoot;
    private EHand eHand;
    private EFutsal EFutsal;
    private EVolley eVolley;
    private ERugby eRugby;
    private  Match match;

    public Championnat() {
        this.match = new Match();
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

    public void entrerScore(Sport sport, String nomEquipe, int scoreEquipe, int scoreAdversaire) {
        match.majScore(scoreEquipe,scoreAdversaire);
        switch (sport) {
            case FOOT: {
                if (geteFoot() == null){
                    seteFoot(new EFoot(nomEquipe, 0, 0, 0, 0));
                }
                eFoot.majSuiteAUnMatch(match);
                break;
            }
            case HAND: {
                if (geteHand() == null){
                    seteHand(new EHand(nomEquipe, 0, 0, 0, 0));
                }
                eHand.majSuiteAUnMatch(match);
                break;
            }
            case FUTSAL: {
                if (getEFutsal() == null){
                    setEFutsal(new EFutsal(nomEquipe, 0, 0, 0, 0));
                }
                EFutsal.majSuiteAUnMatch(match);
                break;
            }
            case VOLLEY: {
                if (geteVolley() == null){
                    seteVolley(new EVolley(nomEquipe, 0, 0, 0, 0));
                }
                eVolley.majSuiteAUnMatch(match);
                break;
            }
            case RUGBY: {
                if (geteRugby() == null){
                    seteRugby(new ERugby(nomEquipe, 0, 0, 0, 0));
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
