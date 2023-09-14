package E08_Adapter_Facade_Proxy.Proxy;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface InternetConnection {
    public void ConnectToHost(String host) throws IOException;
}
