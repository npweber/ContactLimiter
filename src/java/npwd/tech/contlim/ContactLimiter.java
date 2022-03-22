package npwd.tech.contlim;

import npwd.tech.roots.Writer;

import static npwd.tech.roots.Printer.printError;

//ContactLimter: Simple Utility for resetting the contact attempts limiter

public class ContactLimiter {

    public static void main(String args[]){
        //Null check the system var for the count.txt path
        if(System.getenv("siteContactCounter") != null) {
            //If good, go ahead and reset count
            Writer writer = new Writer(Writer.fromString(System.getenv("siteContactCounter")), false);
            writer.write("0");
        } else {
            //If not, printError and exit
            printError("Cannot find site count file...Exiting.");
            System.exit(1);
        }
    }
}
