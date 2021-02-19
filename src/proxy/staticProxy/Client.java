package proxy.staticProxy;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        ReentProxy proxy = new ReentProxy(host);
        proxy.rent();
    }
}
