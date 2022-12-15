package corejavasingleton;

/*
 * Database Singleton class to connect to the database... can be used for in all instances that 
 * connect to the db without defining a new connection every time.
 */
public class Database {

    private static Database dbObject;

    // private constructor to restrict creation of objects from outside this class
    private Database(){

    }

    // a public static method to create object if its not already created,
    public static Database getInstance() {
        
        // create object if not already created.
        if(dbObject == null){
            dbObject = new Database();
        }

        //returns the singleton object
        return dbObject;
    } 

    public void getConnection() {
        System.out.println("You are now connected to the database.");
    }

    
}
