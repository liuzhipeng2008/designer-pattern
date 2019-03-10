package bs.com.gp.iceapex.singleton.hungry;

public class HungryStaticSingleton {

    private static final HungryStaticSingleton instance;

    static {
        instance = new HungryStaticSingleton();
    }

    //构造方式私有
    private HungryStaticSingleton(){

    }
    public static HungryStaticSingleton getInstance(){

        return instance;
    }
}