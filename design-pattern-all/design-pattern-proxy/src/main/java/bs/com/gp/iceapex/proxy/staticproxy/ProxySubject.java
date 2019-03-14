package bs.com.gp.iceapex.proxy.staticproxy;

/**
 * 代理主题
 */
public class ProxySubject {

    private RealSubject realSubject;

    public ProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    public void request(){
        beforeRequest();
        realSubject.request();
        afterRequest();
    }

    private void afterRequest() {
        System.out.println("Do something after request");
    }

    private void beforeRequest() {
        System.out.println("Do something before request");
    }
}