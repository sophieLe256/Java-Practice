package OOP.Printer;

public class Printer {
    private int tonerLevel;
    private int pagePrinted;
    private boolean duplex;

    public Printer (int tonerLevel, boolean duplex){
        if(tonerLevel > -1 && tonerLevel <=100){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

            this.tonerLevel = tonerLevel;
            this.duplex = duplex;
            this.pagePrinted = 0;
    }

    public int addToner(int tonerAmount)
    {
        if(tonerAmount > 0 && tonerAmount <=100){

        } else {
            return -1;
        }

    }
}
