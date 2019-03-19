package bs.com.gp.iceapex.observer.guavagperadvice;

import com.google.common.eventbus.EventBus;

public class GuavaGperTest {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();

        GPer gPer = GPer.getInstance();
        eventBus.register(gPer);

        Teacher tom = new Teacher("Tom");
        eventBus.register(tom);

        Teacher Mic = new Teacher("Mic");
        eventBus.register(Mic);

        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者设计模式适用于哪些场景？");
        question.setSrcSystemName(gPer.getName());
        eventBus.post(question);

    }

}