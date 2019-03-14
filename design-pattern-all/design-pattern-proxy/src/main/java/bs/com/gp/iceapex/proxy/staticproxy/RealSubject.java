package bs.com.gp.iceapex.proxy.staticproxy;

/**
 * 真实主题
 */
public class RealSubject extends Subject {

    public void request() {
        System.out.println("From real subject!");
    }
}