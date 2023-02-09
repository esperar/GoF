package esperer.GoF.Structural.adapter.adapter;

import esperer.GoF.Structural.adapter.feature.Math;

public class AdapterImpl implements Adapter{

    // Math math;

    @Override
    public Float twiceOf(Float f) {
        return (float) Math.twice(f.doubleValue());
    }

    @Override
    public Float halfOf(Float f) {
        System.out.println("Run HalfOf");
        return (float) Math.half(f.doubleValue());
    }
}
