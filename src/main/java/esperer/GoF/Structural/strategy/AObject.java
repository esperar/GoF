package esperer.GoF.Structural.strategy;

public class AObject {

    AInterface aInterface;

    public void funcAA() {
        // 기능을 위임한다. -> 특정 기능을 사용하기위해 다른 객체의 기능을 호출하는 것
        aInterface.funcA();
        aInterface.funcA();

        // System.out.println("AAA");
        // System.out.println("AAA");

        // ~ 기능이 필요합니다. 개발해주세요
    }
}
