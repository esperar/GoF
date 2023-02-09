package esperer.GoF.Structural.adapter.feature;

public class Math {

    // 두배
    public static double twice(double num){
        return num*2;
    }

    // 절반
    public static double half(double num){
        return num/2;
    }

    // 강화된 알고리즘
    public static Double doubled(Double d){
        return d * 2;
    }
}
