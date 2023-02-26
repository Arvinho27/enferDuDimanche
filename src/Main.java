public class Main {
    public static void main(String[] args) {
        Match m1 = new Match(2,0);
        Match m2 = new Match(7,2);
        Match m3 = new Match(30,4);
        Match m4 = new Match(2,3);
        Match m5 = new Match(20,15);
        Match m1bis = new Match(0,5);
        Match m2bis = new Match(2,2);
        Match m3bis = new Match(3,20);
        Match m4bis = new Match(3,1);
        Match m5bis = new Match(10,16);
        EFoot eFoot = new EFoot("Bayern",2,0,0,0);
        Efutsal eFutsal = new Efutsal("Corinthians",2,0,0,0);
        ERugby eRugby = new ERugby("AllBlacks",2,0,0,0);
        EVolley eVolley = new EVolley("France",2,0,0,0);
        EHand eHand = new EHand("MontPellier",2,0,0,0);
        Championnat Champ = new Championnat(eFoot,eHand,eFutsal,eVolley,eRugby, m1,m2,m3,m4,m5,m1bis,m2bis,m3bis,m4bis,m5bis);
        System.out.println("Points : ");
        }
}