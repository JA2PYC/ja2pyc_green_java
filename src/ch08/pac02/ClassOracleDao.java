package ch08.pac02;

public class ClassOracleDao implements InterfaceDataAccessObject {
	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");
	}

	@Override
	public void insert() {
		System.out.println("Oracle DB에 삽입");
	}

	@Override
	public void update() {
		System.out.println("Oracle DB를 수정");
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB에서 삭제");
	}

}
