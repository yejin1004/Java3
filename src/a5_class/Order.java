package a5_class;

import java.util.Date;

public class Order {
    // 필드
    long orderId; // 주문번호 : 숫자형가능(long이 주로 사용됨)
    User user; // 주문자
    Product product; // 주문제품
    Date orderDate; // 주문일
    double totalAmount; // 주문수량

    // 생성자
    public Order() {
    }
    public Order(long orderId, User user, Product product, Date orderDate, double totalAmount) {
        this.orderId = orderId;
        this.user = user;
        this.product = product;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }

    // 메서드
    // 주문수량 입력
    public double setTotalAmount(double newAmount) {
        this.totalAmount = newAmount;
        return this.totalAmount;
    }
}
