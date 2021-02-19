package proxy.staticProxy;


public class ReentProxy implements Rent{
    private Host host;
    public ReentProxy(Host host){
        this.host = host;
    }

    @Override
    public void rent() {
        System.out.println("看房子");
        System.out.println("谈价格");
        host.rent();
    }

}
