package bs.com.gp.iceapex.delegate.simple;

import java.util.HashMap;
import java.util.Map;

public class Leader implements IExecutor{

    private final static Map<String,IExecutor> target = new HashMap<String, IExecutor>();

    static{
        target.put("登录",new ExecutorA());
        target.put("加密",new ExecutorB());
    }
    /**
     * 执行
     *
     * @param command
     */
    public void execute(String command) {
        target.get(command).execute(command);
    }
}