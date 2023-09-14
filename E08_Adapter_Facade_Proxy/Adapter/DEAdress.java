package E08_Adapter_Facade_Proxy.Adapter;

public class DEAdress implements AddressValidator{
    // Fields


    // Constructor
    public DEAdress() {
    }

    // Methods
    @Override
    public boolean istGueltig(String address, String plz, String bundesland) {
        String addressParts[] = address.split(" ", 2);

        boolean houseStreetMatch = addressParts[0].matches("[a-zA-Z]+");
        boolean houseNumberMatch = addressParts[1].matches("\\d+");
        boolean plzMatch = plz.matches("\\d+");
        boolean bundeslandMatch = bundesland.matches("[a-zA-Z]+");

        if (houseStreetMatch && houseNumberMatch
            && plzMatch && bundeslandMatch){
            return true;
        }
        return false;
    }
}
