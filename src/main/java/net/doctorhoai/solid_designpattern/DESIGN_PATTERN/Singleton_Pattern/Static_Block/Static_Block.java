package net.doctorhoai.solid_designpattern.DESIGN_PATTERN.Singleton_Pattern.Static_Block;

public class Static_Block {
    private static Static_Block staticBlock;
    // ngan chan khoi tao lai
    private Static_Block(){}
    static {
        try{
            staticBlock = new Static_Block();
        }catch ( Exception ex ){
            throw new RuntimeException("Exception occured in creating singleton instanse");
        }
    }

    public static Static_Block getStaticBlock(){
        return staticBlock;
    }
}
