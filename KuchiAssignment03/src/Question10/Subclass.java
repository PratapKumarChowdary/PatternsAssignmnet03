package Question10;

import java.io.IOException;
import java.sql.SQLException;

public class Subclass extends DataBase {
	
	@Override
	public static void connect() throws IOException {
        // some code here
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Subclass connector = new Subclass();
        try {
            DataBase.connect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

}
