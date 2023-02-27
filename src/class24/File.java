package class24;




    public abstract class File {
        /*
        Create a class File that will have the following behaviors: open, edit, close. Edit and close are implemented method while open is an abstract.
         Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour: Example: to open .
         java file we need notepad++ or sublime text, to open .doc file we need MicroSoft word to be installed etc
         */

        int size;
        File(int size){
            this.size=size;
        }
        abstract void open();
        void edit(){
            System.out.println("The file was edited");
        }
        void close(){
            System.out.println("Closing the file");
        }

    }
    class  JavaFile extends File{

        JavaFile(int size) {
            super(size);
        }

        @Override
        void open(){
            System.out.println("To open a java file we need a notepad++");
        }
    }
    class WordFile extends File{
        WordFile(int size) {
            super(size);
        }

        @Override
        void open(){
            System.out.println("To open a file we have to install a Microsoft Word");
        }
    }
    class PdfFile extends File{
        PdfFile(int size) {
            super(size);
        }

        @Override
        void open(){
            System.out.println("To open a PDF file we need to install Adobe Acrobat Reader");
        }
    }