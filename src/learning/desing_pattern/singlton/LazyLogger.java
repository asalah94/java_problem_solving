package learning.desing_pattern.singlton;

public class LazyLogger {

    private static volatile LazyLogger logger;

    private LazyLogger(){

    }

    public  static  synchronized LazyLogger getLogger(){

        if (logger == null){
            logger = new LazyLogger();
        }
        return logger;
    }
}
