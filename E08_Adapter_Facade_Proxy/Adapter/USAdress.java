package E08_Adapter_Facade_Proxy.Adapter;

public class USAdress {
    public USAdress(String address, String plz, String bundesland) {
    }


    public boolean isValidUSAddress(String address, String zip,
                                    String state) {
        if (address.length() < 10)
            return false;
        if (zip.length() < 5)
            return false;
        if (zip.length() > 10)
            return false;
        if (state.length() != 2)
            return false;
        return true;
    }
}
