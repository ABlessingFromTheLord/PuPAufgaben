package E07_Command;

import java.io.*;

public class Document {
    // Fields
    private File file;

    // Constructor


    public Document() {
        file = new File("D:\\Git\\Repositories\\PuPAufgaben\\E07_Command\\testFile.txt");
    }

    // Methods
    // Getters
    public File getFile() {
        return this.file;
    }

    // Setters
    public void setFile(File file) {
        this.file = file;
    }


    public void Open() throws IOException {
        BufferedReader bfr = new BufferedReader(new FileReader(this.file));
        String str;

        while((str = bfr.readLine()) != null){
            System.out.println(str);
        }
    }

    public void Save() throws IOException {
            FileWriter fw = new FileWriter(this.file.getName());
            fw.write("I have written in this file");
    }

    public String getFilePath(){
        return this.file.getPath();
    }
}
