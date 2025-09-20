
// 인터페이스: DB 작업에 대한 규격 정의 (검색, 삽입, 수정, 삭제)
public interface DataAccessObject {
    void select();
    void insert();
    void update();
    void delete();
}

// OracleDao.java
// Oracle DB 전용 구현 클래스
class OracleDao implements DataAccessObject {
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

// MySqlDao.java
// MySQL DB 전용 구현 클래스
class MySqlDao implements DataAccessObject {
    @Override
    public void select() {
        System.out.println("MySql DB에서 검색");
    }

    @Override
    public void insert() {
        System.out.println("MySql DB에 삽입");
    }

    @Override
    public void update() {
        System.out.println("MySql DB를 수정");
    }

    @Override
    public void delete() {
        System.out.println("MySql DB에서 삭제");
    }
}

