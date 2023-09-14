package E08_Adapter_Facade_Proxy.Proxy;

import java.io.IOException;

public class NetworkInternetConnection implements InternetConnection{
    // Fields
    private ProxyInternetConnection proxy;

    // Constructor


    public NetworkInternetConnection(ProxyInternetConnection Proxy) {
        this.proxy = Proxy;
    }

    // Methods
    @Override
    public void ConnectToHost(String host) throws IOException {
        proxy.ConnectToHost(host);

        if (this.proxy.connectionAllowed()){
            System.out.println("Connection to host possible");
        }
        else {
            System.out.println("Connection to host impossible");
        }
    }
}
