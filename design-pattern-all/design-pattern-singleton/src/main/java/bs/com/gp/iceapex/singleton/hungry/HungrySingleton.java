package bs.com.gp.iceapex.singleton.hungry;

public class HungrySingleton {

    private  static final HungrySingleton instance = new HungrySingleton();

    //构造方式私有
    private HungrySingleton(){

    }
    public static HungrySingleton getInstance(){

        return instance;
    }
}