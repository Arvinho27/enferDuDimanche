public class Main {
    public static void main(String[] args) {
        Championnat championnat = new Championnat();
        championnat.entrerScore(Sport.FOOT,2,0);
        championnat.entrerScore(Sport.FOOT,4,1);
        championnat.entrerScore(Sport.HAND,13,0);
        championnat.entrerScore(Sport.HAND,17,20);
        championnat.entrerScore(Sport.FUTSAL,5,0);
        System.out.println(championnat.restituerResChampionnat());
        }
}