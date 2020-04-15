package proxyPattern;

/**
 * 专业团队代理运营
 * @author Float
 */
public class ProxySubject implements Subject {

    private RealSubject realSubject;

    /**
     * 将实际对象通过强引用注入到代理类中
     */
    public ProxySubject() {
        this.realSubject = new RealSubject();
    }

    @Override
    public void manageOfficialAccount() {
        // 增强对象行为过程
        System.out.println("广告宣传");
        realSubject.manageOfficialAccount();
        System.out.println("水军造势，送你上热搜！");
    }


    public static void main(String[] args) {
        Subject subject = new ProxySubject();
        subject.manageOfficialAccount();
    }
}
