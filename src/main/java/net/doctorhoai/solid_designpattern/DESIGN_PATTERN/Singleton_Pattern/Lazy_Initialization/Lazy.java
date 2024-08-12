package net.doctorhoai.solid_designpattern.DESIGN_PATTERN.Singleton_Pattern.Lazy_Initialization;


// hoat dong tot thread don nhung xau khi threac nhiu luong
public class Lazy {
    private static Lazy lazy;
    private Lazy(){}
    public static Lazy getLazy(){
        if( lazy == null ) {
            lazy = new Lazy();
        }
        return lazy;
    }
}
