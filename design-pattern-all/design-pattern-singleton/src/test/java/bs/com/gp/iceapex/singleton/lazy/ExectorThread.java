package bs.com.gp.iceapex.singleton.lazy;


/**
 * Created by Tom.
 */
public class ExectorThread implements Runnable{

    public void run() {
        //LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
        LazyInnerClassSingleton singleton = LazyInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
