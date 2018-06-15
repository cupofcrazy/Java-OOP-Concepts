package com.company.oop;

public class Printer {
    public int tonerLevel;
    public int pagesPrinted;
    public boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }
    //Fill the printer with toner with a value no greater than 100
    public int fillToner(int tonerAmount) {
        if (this.tonerLevel > 0 && tonerLevel <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }

        } else {
            return -1;
        }
        this.tonerLevel += tonerAmount;
        return this.tonerLevel;
    }

    // Print pages
    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.duplex) {
            pagesToPrint /= pages;
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
}
