package bs.com.gp.iceapex.delegate.simple;

public class Boss {
    public static void main(String[] args) {
        Leader leader = new Leader();
        leader.execute("登录");
        leader.execute("加密");
    }
}