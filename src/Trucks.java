enum nametruck{
    Scania(19929), volvo(328), renault(2428), iveco(4282), mercedesbenz(328), man(832), daf(832);

    public int poj;

    public int getNumber()
    {
        return this.poj;
    }

    nametruck (int poj)
    {
        this.poj = poj;
    }
}

public class Trucks {
    int p;
    nametruck n;

    Trucks(int poj, nametruck nametruck){
        this.p = poj;
        this.n = nametruck;
    }

    static Trucks truck1 = new Trucks(100, nametruck.mercedesbenz);
}
