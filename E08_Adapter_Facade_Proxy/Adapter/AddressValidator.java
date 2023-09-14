package E08_Adapter_Facade_Proxy.Adapter;

public interface AddressValidator {
    public boolean istGueltig(String address, String plz, String bundesland);
}
