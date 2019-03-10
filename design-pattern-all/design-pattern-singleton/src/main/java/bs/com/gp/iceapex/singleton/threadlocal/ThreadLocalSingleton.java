package bs.com.gp.iceapex.singleton.threadlocal;

public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> instance;

    static {
        instance = new ThreadLocal<ThreadLocalSingleton>() {
            protected ThreadLocalSingleton initialValue() {
                return new ThreadLocalSingleton();
            }
        };
    }
     private ThreadLocalSingleton(){

     }
     public static ThreadLocalSingleton getInstance(){
        return instance.get();
     }
}