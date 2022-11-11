public interface CheckTransport {
    static void SendTransport(Ships ship1, Trucks truck1){
        System.out.println("Wypuszczono: " + ship1.n + " na wodę");
        System.out.println("Wyjechał właśnie: " + truck1.n + "na drogi");
    }

    static void countleavetrans(boolean t, boolean f){

        int summary = 0;

        if(t){
            names allnames[] = names.values();
            for(names signal : allnames){
                summary = summary + signal.getNumber();
            }
            System.out.println("łączna pojemność: " + summary);
        }
        if (f){
            nametruck allnamest[] = nametruck.values();
            for(nametruck signalt : allnamest){
                summary = summary + signalt.getNumber();
            }
            System.out.println("łączna pojemność: " + summary);
        }
    }
}
