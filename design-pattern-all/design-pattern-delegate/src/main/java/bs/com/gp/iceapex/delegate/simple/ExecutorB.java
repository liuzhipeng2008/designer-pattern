package bs.com.gp.iceapex.delegate.simple;

public class ExecutorB implements IExecutor {
    /**
     * 执行
     *
     * @param command
     */
    public void execute(String command) {
        System.out.println("员工B开始做"+command+"的工作");
    }
}