import java.util.function.Function;

public class Logger {

    private static  volatile Logger instance;

    private Logger(){

    }

    public  synchronized static  Logger getInstance(){

        if (instance == null){
            instance = new Logger();

        }
        return  instance;
    }



}
