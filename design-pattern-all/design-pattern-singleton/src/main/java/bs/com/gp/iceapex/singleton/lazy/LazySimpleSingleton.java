package bs.com.gp.iceapex.singleton.lazy;

public class LazySimpleSingleton {

    private static LazySimpleSingleton instance = null;

    //构造方式私有
    private LazySimpleSingleton() {

    }

    public static LazySimpleSingleton getInstance() {

        if(null ==  instance){
            instance = new LazySimpleSingleton();
        }

        return instance;
    }
}