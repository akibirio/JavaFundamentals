package corejavasingleton;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Database db;

        // refer to the only Object of Database.
        db = Database.getInstance();

        db.getConnection();
    }
}