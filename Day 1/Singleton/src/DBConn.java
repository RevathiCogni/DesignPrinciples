
public class DBConn {
	private static DBConn instance;

	private DBConn() {
		instance = null;
	}

	static DBConn getInstance() {
		if (instance == null)
			instance = new DBConn();
		return instance;
	}
}
