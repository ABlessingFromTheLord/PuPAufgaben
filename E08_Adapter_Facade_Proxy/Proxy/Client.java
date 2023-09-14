package E08_Adapter_Facade_Proxy.Proxy;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        // QNS is the use of a boolean to be set when possible allowed?
        // is the instantiation of a proxy object in NetworkInternetConnection allowed?
        // is the exception well handled????

        ProxyInternetConnection proxy = new ProxyInternetConnection(true);
        NetworkInternetConnection nic = new NetworkInternetConnection(proxy);
        nic.ConnectToHost("but");

    }
}
