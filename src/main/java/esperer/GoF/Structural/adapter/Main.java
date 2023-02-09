package esperer.GoF.Structural.adapter;

import esperer.GoF.Structural.adapter.adapter.Adapter;
import esperer.GoF.Structural.adapter.adapter.AdapterImpl;

public class Main {
    public static void main(String[] args) {
        //어댑터 패턴: 호환성이 없는 인터페이스 때문에 사용하지 못하는 기능을 개조해서 사용하는 것
        Adapter adapter = new AdapterImpl();

        System.out.println(adapter.twiceOf(100f));

        System.out.println(adapter.halfOf(88f));

        System.out.println(adapter.halfOf(88f));
        System.out.println(adapter.halfOf(88f));
        System.out.println(adapter.halfOf(88f));
        System.out.println(adapter.halfOf(88f));
    }
}
