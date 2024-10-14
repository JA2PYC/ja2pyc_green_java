package ch06.pac05;

public class ClassShopService {
	private static ClassShopService singleton = new ClassShopService();
	
	private ClassShopService() {
		
	}
	
	static ClassShopService getInstance() {
		return singleton;
	}
}