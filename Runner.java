public class Runner {
    public static void main(String[] args) {
        HotDogStand stand1 = new HotDogStand(123,34);
        HotDogStand stand2 = new HotDogStand(178,45);
        HotDogStand stand3 = new HotDogStand(145,62);
        stand1.justSold();
        stand2.justSold();
        stand3.justSold();
        stand1.justSold();
        stand2.justSold();
        stand3.justSold();
        stand2.justSold();
        stand2.justSold();
        stand3.justSold();
        System.out.println("Stand 1 has  sold "+stand1.getNoSold());
        System.out.println("Stand 2 has sold "+stand2.getNoSold());
        System.out.println("Stand 3 has sold "+stand3.getNoSold());
    }
}