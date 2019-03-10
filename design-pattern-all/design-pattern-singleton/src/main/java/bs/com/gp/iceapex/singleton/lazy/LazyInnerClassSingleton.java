package bs.com.gp.iceapex.singleton.lazy;

public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton(){
        if(LazyHolder.instance != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static LazyInnerClassSingleton getInstance(){

        return LazyHolder.instance;
    }

    private static class LazyHolder{
        private static final LazyInnerClassSingleton instance = new LazyInnerClassSingleton();
    }
}