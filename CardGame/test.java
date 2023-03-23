package CardGame;

public class test {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.InitialDeck();

        Player p2 = new Player();
        p2.InitialDeck();

        for(int i = 0; i < 3; i++){
            p1.draw();
            p2.draw();
        }
        System.out.printf(p1.ShowCardOnhand() + "\n" + p2.ShowCardOnhand());
        p1.discard(p1.cardOnHand.get(0));
        p2.discard(p2.cardOnHand.get(1));
        System.out.println();
        System.out.printf(p1.ShowCardOnhand() + "\n" + p2.ShowCardOnhand());
    }
}
