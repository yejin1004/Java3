package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcExample2 {
    // #1. 데이터베이스 연결 정보
    private static final String URL = "jdbc:mariadb://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // #2. INSERT
    // 부서테이블에 새로운 행 추가
    public void insertDepartment(String deptNo, String deptName) {
        String query = "insert into 부서(부서번호, 부서명) "
                + "values (?, ?)"; // ?를 플레이스홀더(placeholder)라고 부름
        try(
                Connection connection = DriverManager.getConnection(
                                        URL, USER, PASSWORD);
                PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, deptNo);
            ps.setString(2, deptName);
            ps.executeUpdate(); // <주의> 쓰기동작은 executeUpdate 사용!!
            System.out.println("INSERT 성공");
        }catch (SQLException e) {
            System.out.println("에러");
        }
    }

    // #3. UPDATE
    // 새로만든 해외영업부의 이름을 글로벌영업부로 변경
    public void updateDepartment(String oldName, String newName) {
        String query = "update 부서 set 부서명=? where 부서명=?";
        try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
            PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, newName);
            ps.setString(2, oldName);
            ps.executeUpdate();
            System.out.println("UPDATE 성공");
        }catch (SQLException e) {
            System.out.println("에러");
        }
    }

    public static void main(String[] args) {
        JdbcExample2 repository = new JdbcExample2();
        //repository.insertDepartment("A5", "총무부");
        //repository.insertDepartment("A6", "해외영업부");
        repository.updateDepartment("해외영업부", "글로벌영업부");
    }
}
