package jdbc;

import a8_modifier.Modifier1.pack2.C;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcExample1 {
    // #1. 데이터베이스 연결 정보
    private static final String URL = "jdbc:mariadb://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // #2. 정보를 조회하는 메서드 정의
    // 고객번호로 고객 정보 조회
    public Customer getCustomer(String customerId){
        Customer customer = null;
        String query = "select * from 고객 where 고객번호 = ?";
        try (
            Connection connection = DriverManager.getConnection(
                    URL, USER, PASSWORD);
            PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, customerId);
            try (ResultSet resultSet = ps.executeQuery()){
                System.out.println("연결성공");
                // O-R 매핑 (Object - Relation)
                if (resultSet.next()) {
                    customer = new Customer();
                    customer.setCustomerId(resultSet.getString("고객번호"));
                    customer.setCompanyName(resultSet.getString("고객회사명"));
                    customer.setContactName(resultSet.getString("담당자명"));
                    customer.setContactTitle(resultSet.getString("담당자직위"));
                    customer.setAddress(resultSet.getString("주소"));
                    customer.setCity(resultSet.getString("도시"));
                    customer.setRegion(resultSet.getString("지역"));
                    customer.setPhone(resultSet.getString("전화번호"));
                    customer.setMileage(resultSet.getInt("마일리지"));
                }
            }
        }catch (SQLException e) {
            System.out.println("에러 발생");
        }
        return customer;
    }

    // 모든 고객정보를 조회
    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        String query = "select * from 고객";
        try (
            Connection connection = DriverManager.getConnection(
                        URL, USER, PASSWORD);
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet resultSet = ps.executeQuery()){
            /* Statement vs PreparedStatement
            * Statement는 ?가 없는 고정된 SQL구문을 전송할 때 사용
            * PreparedStatement는 ?가 있는 동적인 SQL구문을 전송할 때 사용
            * <중요> 현업에서는 PreparedStatement를 사용하는 것이 권장됨
            * 해커의 SQL 삽입공격을 방지할 수 있음
            * */
            // Statement statement = connection.createStatement();
            // ResultSet resultSet = statement.executeQuery(query)){
            System.out.println("연결성공");
            // O-R 매핑 (Object - Relation)
            while (resultSet.next()) {
                Customer customer = new Customer();
                customer.setCustomerId(resultSet.getString("고객번호"));
                customer.setCompanyName(resultSet.getString("고객회사명"));
                customer.setContactName(resultSet.getString("담당자명"));
                customer.setContactTitle(resultSet.getString("담당자직위"));
                customer.setAddress(resultSet.getString("주소"));
                customer.setCity(resultSet.getString("도시"));
                customer.setRegion(resultSet.getString("지역"));
                customer.setPhone(resultSet.getString("전화번호"));
                customer.setMileage(resultSet.getInt("마일리지"));

                customers.add(customer);
            }
        }catch (SQLException e) {
            System.out.println("에러 발생");
        }
        return customers;
    }

    public static void main(String[] args) {
        // 데이터베이스 연결
        // sql 쿼리를 전송해서 응답을 받음
        // 응답받은 정보를 클래스에 매핑
        JdbcExample1 repository = new JdbcExample1();
        Customer foundCustomer = repository.getCustomer("AIHTR");
        System.out.println(foundCustomer);
        List<Customer> allCustomers = repository.getAllCustomers();
        System.out.println(allCustomers);
    }
}
