package net.doctorhoai.solid_designpattern.DESIGN_PATTERN.Singleton_Pattern.Bill_PughSingleton;

public class BPS {
    private BPS(){}
    private static class SingletonHepler{
        private static final BPS instanse = new BPS();
    }

    public static BPS getInstance(){
        return SingletonHepler.instanse;
    }
}
