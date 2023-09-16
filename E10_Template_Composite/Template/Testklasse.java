package E10_Template_Composite.Template;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;

public class Testklasse {
    public static void main(String[] args) throws IOException, ParseException {
        // QN does splitting the data in CSVHandler and TXCTHandler make sense
        // splitting based on "," or "|" or can just check the extension like I did
        // alsop had to inlude the einlesen function individual classes, is that okay?

        File csvFile = new File("D:\\Git\\Repositories\\PuPAufgaben\\E10_Template_Composite\\Template\\DAX-2019-2020.csv");
        File txtFile = new File("D:\\Git\\Repositories\\PuPAufgaben\\E10_Template_Composite\\Template\\dowjones_2019_2020.txt");

        CSVHandler csvh = new CSVHandler(csvFile);

        /*for (Tageskurs tk:csvh.einlesen().getAktienkurs()) {
            System.out.println(tk.datum + " " + tk.eroeffnungswert + " " + tk.maximalwert + " " + tk.minimalwert + " " + tk.schlusswert);
        }*/

        TXTHandler txth = new TXTHandler(txtFile);
        txth.einlesen();
            /*for (Tageskurs tk:txth.einlesen().getAktienkurs()) {
            System.out.println(tk.datum + " " + tk.eroeffnungswert + " " + tk.maximalwert + " " + tk.minimalwert + " " + tk.schlusswert);
        }*/


    }
}
