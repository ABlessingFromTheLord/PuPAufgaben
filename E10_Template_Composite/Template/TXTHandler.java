package E10_Template_Composite.Template;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TXTHandler extends DatenHandler{
    // Fields
    private File datei;

    // Constructor
    public TXTHandler(File datei) {
        super(datei);
        this.datei = datei;
    }

    // Methods
    @Override
    public Aktienkurs einlesen() throws IOException, ParseException {
        if (datei.exists()){
            validiereDateipfad();
            return transformiereDaten();
        }
        else {
            System.out.println("File does not exist");
            return null;
        }
    }

    @Override
    public boolean validiereDateipfad() throws IOException, ParseException {
        String fileName = this.datei.getName();
        String extension = "";

        int i = fileName.lastIndexOf('.');

        if(i >=0){
            extension = fileName.substring(i+1);
        }

        if (extension.equals("txt")){
            transformiereDaten();
            return true;
        }
        else {
            System.out.println("File type is not supported");
            return false;
        }
    }

    @Override
    public Aktienkurs transformiereDaten() throws IOException, ParseException {
        Aktienkurs aktienkurs = new Aktienkurs();

        BufferedReader bfr = new BufferedReader(new FileReader(datei));
        String read = "";
        while((read = bfr.readLine()) != null){
            read = bfr.readLine();
            String[] splitted = read.split("\\|");

            // creating an Tageskurs
            Tageskurs tageskurs = new Tageskurs();

            Date stringToDate = new SimpleDateFormat("yyyy-MM-dd").parse(splitted[0]);

            tageskurs.datum = stringToDate;
            tageskurs.eroeffnungswert = Double.parseDouble(splitted[1]);
            tageskurs.schlusswert = Double.parseDouble(splitted[2]);
            tageskurs.maximalwert = Double.parseDouble(splitted[3]);
            tageskurs.minimalwert = Double.parseDouble(splitted[4]);
            aktienkurs.getAktienkurs().add(tageskurs);
        }
        return aktienkurs;
    }
}
