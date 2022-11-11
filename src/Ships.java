enum names{
    Titanic(100), Santa_Maria(299), Aurora(189), Bounty(382), Gustloff(182), Bismarck(28);

    public int poj;

    public int getNumber()
    {
        return this.poj;
    }

    names (int poj)
    {
        this.poj = poj;
    }
}

public class Ships implements CheckTransport{
    int p;
    names n;

    Ships(int poj, names names){
        this.p = poj;
        this.n = names;
    }

    public static void existship(){
        String nameship = "Astute";
        try{
            names.valueOf(nameship);
        }catch (Exception e){
            System.out.println("W doku nie posiadamy statku " + nameship);
        }
    }

    static Ships ship1 = new Ships(100, names.Aurora);
}
