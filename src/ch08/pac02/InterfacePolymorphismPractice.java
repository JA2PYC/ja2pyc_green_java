package ch08.pac02;

public class InterfacePolymorphismPractice {
	static void dbWork(InterfaceDataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		// Class Oracle Dao
		System.out.println("-------------------- Class Oracle Dao --------------------");
		dbWork(new ClassOracleDao());
		
		// Class MySql Dao
		System.out.println("-------------------- Class MySql Dao --------------------");
		dbWork(new ClassMySqlDao());
	}
}
