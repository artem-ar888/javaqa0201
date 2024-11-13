public class Main {
    public static void main(String[] args) {
        int ticketPrice = 13_676;
        int bonusMilePrice = 20;
        int bonus = ticketPrice / bonusMilePrice;
        System.out.println("За билет стоимостью " + ticketPrice + " руб.");
        System.out.println("Вам начислено " + bonus + " бонусн(ая/ые/ых) мил(я/и/ей)");
    }
}