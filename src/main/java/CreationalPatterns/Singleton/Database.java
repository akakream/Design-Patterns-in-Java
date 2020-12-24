package CreationalPatterns.Singleton;

public final class Database {

    private static Database database;
    private String value;

    private Database(String value) {
        this.value = value;
    }

    public static Database getDatabaseInstance(String value) {
        if (database == null)
            database =  new Database(value);
        return database;
    }

    public String getValue() {
        return value;
    }
}
