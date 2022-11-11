public class Main {
    public static void main(String[] args) {
        Ships.existship();
        CheckTransport.SendTransport(Ships.ship1, Trucks.truck1);
        CheckTransport.countleavetrans(true, true);
    }
}
