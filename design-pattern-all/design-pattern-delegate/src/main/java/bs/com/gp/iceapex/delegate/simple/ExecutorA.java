package bs.com.gp.iceapex.delegate.simple;

public class ExecutorA implements  IExecutor {
    /**
     * 执行
     *
     * @param command
     */
    public void execute(String command) {
        System.out.println("员工A开始做"+command+"的工作");
    }
}