public class Main {
    public static void main(String[] args) {
        Match m1 = new Match(2,0);
        Match m2 = new Match(7,2);
        Match m3 = new Match(10,5);
        Match m4 = new Match(2,3);
        Match m5 = new Match(30,30);
        System.out.println(m1);
        EFoot e1 = new EFoot("Bayern");
        System.out.println("L'équipe "+e1.name+" à gagné "+e1.calculNbPoints(m1));
        Efutsal e2 = new Efutsal("Corinthians");
        System.out.println("L'équipe "+e2.name+" a gagné "+e2.calculNbPoints(m2));
        ERugby e3 = new ERugby("AllBlacks");
        System.out.println("L'équipe "+e3.name+" a gagné "+e3.calculNbPoints(m3));
        EVolley e4 = new EVolley("France");
        System.out.println("L'équipe "+e4.name+" à gagné "+e4.calculNbPoints(m4));
        EHand e5 = new EHand("MontPellier");
        System.out.println("L'équipe "+e5.name+" à gagné "+e5.calculNbPoints(m5));
    }
}