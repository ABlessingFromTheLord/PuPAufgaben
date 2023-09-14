package E08_Adapter_Facade_Proxy.Adapter;

public class USAdressAdapter implements AddressValidator{
    // Fields


    // Constructor
    public USAdressAdapter() {
    }

    // Methods
    @Override
    public boolean istGueltig(String address, String plz, String bundesland) {
        return new USAdress(address, plz, bundesland).isValidUSAddress(address, plz, bundesland);
    }
}
