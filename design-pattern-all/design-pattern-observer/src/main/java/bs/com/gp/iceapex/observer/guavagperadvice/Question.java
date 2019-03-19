package bs.com.gp.iceapex.observer.guavagperadvice;

/**
 * Created by Tom on 2019/3/17.
 */
public class Question {

    private String userName;
    private String content;
    private String srcSystemName;//来源系统的名称

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSrcSystemName() {
        return srcSystemName;
    }

    public void setSrcSystemName(String srcSystemName) {
        this.srcSystemName = srcSystemName;
    }
}
