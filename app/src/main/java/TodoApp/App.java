
package TodoApp;

import java.sql.Connection;
import util.ConnectionDB;

public class App {

    public static void main(String[] args) {
            Connection c = ConnectionDB.getConnection();
            
            ConnectionDB.closeConnection(c);
    }
}
