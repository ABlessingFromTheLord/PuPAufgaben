package E08_Adapter_Facade_Proxy.Proxy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProxyInternetConnection implements InternetConnection{
    // Fields
    private boolean useWhitelist;
    private boolean connectionAllowed;
    private boolean inBlacklist;
    private boolean inWhitelist;

    // Constructor
    public ProxyInternetConnection(boolean useWhitelist) {
        super();
        this.useWhitelist = useWhitelist;
    }

    // Methods
    public boolean connectionAllowed() {
        return connectionAllowed;
    }

    @Override
    public void ConnectToHost(String host) throws IOException {
        BufferedReader bufferedReaderWhitelist = new BufferedReader(
                new FileReader(
                        "D:\\Git\\Repositories\\PuPAufgaben\\E08_Adapter_Facade_Proxy\\Proxy\\whitelist.txt"));

        BufferedReader bufferedReaderBlacklist = new BufferedReader(
                new FileReader("D:\\Git\\Repositories\\PuPAufgaben\\E08_Adapter_Facade_Proxy\\Proxy\\blacklist.txt"));

        String str;
        if (useWhitelist){
            while ((str = bufferedReaderWhitelist.readLine()) != null){
                if (str.equals(host)) {
                    inWhitelist = true;
                }
            }
        }

        else {
            while ((str = bufferedReaderBlacklist.readLine()) != null){
                if (str.equals(host)) {
                    inBlacklist = true;
                }
            }
        }

        if(inWhitelist && (!inBlacklist)) connectionAllowed = true;

    }
}
