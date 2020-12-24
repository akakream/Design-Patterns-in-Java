package CreationalPatterns.Prototype;

public class Lion extends Felidae{
    private final static String genus = "panthera";
    private int height;

    public Lion() {
    }

    public Lion(int height) {
        this.height = height;
    }

    public Lion(Lion lion) {
        super(lion);
        if (lion != null)
            this.height = lion.height;
    }

    public int getHeight() {
        return height;
    }

    public static String getGenus() {
        return genus;
    }

    public void setSomeVar(int someVar) {
        this.somevar = someVar;
    }

    @Override
    public Felidae clone() {
        return new Lion(this);
    }
}
