package proxyPattern;

public class RealSubject implements Subject {


    @Override
    public void manageOfficialAccount() {
        System.out.println("学习经营公众号策略！");
    }
}
