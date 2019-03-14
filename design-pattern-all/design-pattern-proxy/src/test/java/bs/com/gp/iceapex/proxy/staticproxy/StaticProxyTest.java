package bs.com.gp.iceapex.proxy.staticproxy;

public class StaticProxyTest {
    public static void main(String[] args) {
        ProxySubject proxySubject = new ProxySubject(new RealSubject());
        proxySubject.request();
    }
}