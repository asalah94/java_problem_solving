package learning;

public class EagerLogger {


    private static EagerLogger logger = new EagerLogger();


    private EagerLogger(){

    }

    public  static EagerLogger getLogger(){
        if(logger == null){
            logger = new EagerLogger();
        }
        return logger;
    }

}
