public class Printer {

    private int numPages;
    private int numPagesPrinted;
    private int tonerVolume;

    public Printer(int numPages, int tonerVolume){
        this.numPages = numPages;
        this.tonerVolume = tonerVolume;
    }
    public int getNumPages() {
        return this.numPages;
    }

    public int print(int pages, int copies) {

        numPagesPrinted =  pages * copies;

        if (numPagesPrinted <= numPages) {
            numPages -= numPagesPrinted;
            reduceTonerVolume(numPagesPrinted);
        }
        return numPagesPrinted;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }

    public void reduceTonerVolume(int tonerUsed) {
        this.tonerVolume -= tonerUsed;
    }


}
