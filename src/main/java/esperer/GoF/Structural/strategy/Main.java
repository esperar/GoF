package esperer.GoF.Structural.strategy;

public class Main {
    public static void main(String[] args) {
        // 스트레티지 패턴: 여러 알고리을 하나의 추상적인 접근을 만들어 접근 점에서 서로 교환 가능하도록 만드는 패턴
        AInterface aInterface = new AInterfaceImpl();

        // 통로
        // aInterface.funcA();

        AObject aObject = new AObject();
        aObject.funcAA();
    }
}
