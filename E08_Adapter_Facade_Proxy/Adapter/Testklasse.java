package E08_Adapter_Facade_Proxy.Adapter;

public class Testklasse {
    public static void main(String[] args) {
        DEAdress deAdress = new DEAdress();
        USAdressAdapter usAdressAdapter = new USAdressAdapter();

        System.out.println(deAdress.istGueltig("Markstrasse 82", "84612", "Nordrhinewestfalen"));
        System.out.println(usAdressAdapter.istGueltig("sanfransisco", "7856785", "CA"));

        // Is the adapter now only for visibility? ie. so that both may be called isGueltig

    }
}
