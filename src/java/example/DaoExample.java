// DaoExample.java
public class DaoExample {
    // 매개변수 타입을 인터페이스로 지정 → 다형성 활용
    public static void dbWork(DataAccessObject dao) {
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }

    public static void main(String[] args) {
        // OracleDao 객체 전달 → Oracle DB 작업 수행
        dbWork(new OracleDao());

        // MySqlDao 객체 전달 → MySql DB 작업 수행
        dbWork(new MySqlDao());
    }
}
 
    

