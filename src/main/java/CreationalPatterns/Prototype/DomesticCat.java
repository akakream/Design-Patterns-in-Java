package CreationalPatterns.Prototype;

public class DomesticCat extends Felidae{
    private static final String genus = "felis";
    private int height;

    public DomesticCat() {
    }

    public DomesticCat(int height) {
        this.height = height;
    }

    public DomesticCat(DomesticCat cat) {
        super(cat);
        if (cat != null)
            this.height = cat.height;
    }

    public int getHeight() {
        return height;
    }

    public static String getGenus() {
        return genus;
    }

    @Override
    public Felidae clone() {
        return null;
    }
}
