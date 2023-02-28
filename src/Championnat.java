public class Championnat {
    private EFoot eFoot;
    private EHand eHand;
    private EFutsal EFutsal;
    private EVolley eVolley;
    private ERugby eRugby;
    private  Match match;

    /*public Championnat() {
        this.eFoot = new EFoot(Sport.FOOT,"Bayern", 0, 0, 0, 0);
        this.eHand = new EHand(Sport.HAND,"Montpellier",0,0,0,0);
        this.EFutsal = new EFutsal(Sport.FUTSAL,"Flamengo",0,0,0,0);
        this.eVolley = new EVolley(Sport.VOLLEY,"France",0,0,0,0);
        this.eRugby = new ERugby(Sport.RUGBY,"Toulon",0,0,0,0);
        this.match = new Match(0,0);
    }*/


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

    public void entrerScore(Sport sport, int scoreEquipe, int scoreAdversaire) {
        match.majScore(scoreEquipe,scoreAdversaire);
        switch (sport) {
            case FOOT: {
                if (geteFoot() == null){
                    seteFoot(new EFoot(Sport.FOOT,"Bayern", 0, 0, 0, 0));
                }
                eFoot.majSuiteAUnMatch(match);
                break;
            }
            case HAND: {
                if (geteHand() == null){
                    seteHand(new EHand(Sport.HAND,"Montpellier", 0, 0, 0, 0));
                }
                eHand.majSuiteAUnMatch(match);
                break;
            }
            case FUTSAL: {
                if (getEFutsal() == null){
                    setEFutsal(new EFutsal(Sport.FUTSAL,"FLamengo", 0, 0, 0, 0));
                }
                EFutsal.majSuiteAUnMatch(match);
                break;
            }
            case VOLLEY: {
                if (geteVolley() == null){
                    seteVolley(new EVolley(Sport.VOLLEY,"France", 0, 0, 0, 0));
                }
                eVolley.majSuiteAUnMatch(match);
                break;
            }
            case RUGBY: {
                if (geteRugby() == null){
                    seteRugby(new ERugby(Sport.RUGBY,"Toulon", 0, 0, 0, 0));
                }
                eRugby.majSuiteAUnMatch(match);
                break;
            }
            default: {
                System.out.println("PrObLeM BiP bOp");
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
