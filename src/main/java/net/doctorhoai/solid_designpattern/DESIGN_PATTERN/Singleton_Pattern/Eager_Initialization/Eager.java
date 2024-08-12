package net.doctorhoai.solid_designpattern.DESIGN_PATTERN.Singleton_Pattern.Eager_Initialization;

public class Eager {
    private static final Eager eager = new Eager();
    // tranh khoi tai lai -> contructor private
    private Eager(){}
    public static Eager getEager(){
        return eager;
    }
}
