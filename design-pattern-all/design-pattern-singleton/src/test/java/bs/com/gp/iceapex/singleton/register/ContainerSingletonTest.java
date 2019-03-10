package bs.com.gp.iceapex.singleton.register;

public class ContainerSingletonTest {
    public static void main(String[] args) throws Exception {
        Object obj = ContainerSingleton.getInstance("bs.com.gp.iceapex.singleton.Pojo");
        System.out.println(obj);
    }
}