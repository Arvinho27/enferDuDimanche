public class Main {
    public static void main(String[] args) {
        Championnat championnat = new Championnat();
        championnat.entrerScore("Bayern",1,3);
        System.out.println(championnat.listerNbPointsParEquipe());
        championnat.entrerScore("Bayern",2,2);
        System.out.println(championnat.listerNbPointsParEquipe());
        }
}