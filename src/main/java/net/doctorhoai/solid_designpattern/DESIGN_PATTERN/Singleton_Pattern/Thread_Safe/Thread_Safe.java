package net.doctorhoai.solid_designpattern.DESIGN_PATTERN.Singleton_Pattern.Thread_Safe;

public class Thread_Safe {
    private static Thread_Safe threadSafe;
    private Thread_Safe(){}
    public static Thread_Safe getThreadSafe(){
        if( threadSafe == null ){
            synchronized ( Thread_Safe.class ){
                if( threadSafe == null ){
                    threadSafe =new Thread_Safe();
                }
            }
        }
        return threadSafe;
    }
}
