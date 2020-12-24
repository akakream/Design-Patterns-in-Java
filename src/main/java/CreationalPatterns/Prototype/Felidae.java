package CreationalPatterns.Prototype;

public abstract class Felidae {
    protected final static String family = "carnivore";
    protected final static String kingdom = "animalia";
    protected int somevar;


    public Felidae() {
    }

    public Felidae(Felidae felidae) {
        if (felidae != null) {
            this.somevar = felidae.somevar;
        }
    }

    public int getSomevar() {
        return somevar;
    }

    public abstract Felidae clone();
}
