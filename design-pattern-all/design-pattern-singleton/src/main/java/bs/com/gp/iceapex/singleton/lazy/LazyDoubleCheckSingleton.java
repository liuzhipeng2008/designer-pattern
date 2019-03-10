package bs.com.gp.iceapex.singleton.lazy;

public class LazyDoubleCheckSingleton {
    private static LazyDoubleCheckSingleton instance = null;

    //构造方式私有
    private LazyDoubleCheckSingleton() {

    }

    public static LazyDoubleCheckSingleton getInstance() {

        if(null ==  instance){
            synchronized (LazySimpleSingleton.class){
                if(null ==  instance) {
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }

        return instance;
    }
    //防止序列化改变对象
    public Object readResolve() {
        return instance;
    }
}