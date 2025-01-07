package hello.springtx.order;

// 결제 잔고 부족
public class NotEnoughMoneyException extends Exception{

    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
