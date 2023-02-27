package class24;

public class FileTester {
    public static void main(String[] args) {

             File [] file={new JavaFile(1024),new WordFile(25),new PdfFile(50)};
        for (int i = 0; i < file.length ; i++) {
            File f=file[i];
            f.open();
            f.edit();
            f.close();
            System.out.println("----------------");
        }
              for(File x:file){
                  x.open();
                  x.edit();
                  x.close();
              }

    }
}