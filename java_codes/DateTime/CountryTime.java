// Java Program to Display Time in Different Country Format
  
import java.text.DateFormat;
import java.util.*;
  
public class Main {
    public static void main(String[] args) throws Exception
    {
        Date d1 = new Date();
  
        // creating a new locale for England Format
        Locale locEngland = new Locale("en", "ch");
  
        // initializing the date formatter and converting
        // the date
        DateFormat de = DateFormat.getDateInstance(
                        DateFormat.FULL, locEngland);
  
        System.out.println("England Format: "
                           + de.format(d1));
  
        // creating a new locale for Italian Format
        Locale locItalian = new Locale("it", "ch");
  
        // initializing the date formatter and converting
        // the date
        DateFormat di = DateFormat.getDateInstance(
                        DateFormat.FULL, locItalian);
        
        System.out.println("Italian Format: "
                           + di.format(d1));
  
        // creating a new locale for Russian Format
        Locale locRussian = new Locale("ru", "ch");
  
        // initializing the date formatter and converting
        // the date
        DateFormat dr = DateFormat.getDateInstance(
                        DateFormat.FULL, locRussian);
        
        System.out.println("Russian Format: "
                           + dr.format(d1));
  
        // creating a new locale for French Format
        Locale locFrench = new Locale("fr", "ch");
  
        // initializing the date formatter and converting
        // the date
        DateFormat df = DateFormat.getDateInstance(
                        DateFormat.FULL, locFrench);
        
        System.out.println("French Format: "
                           + df.format(d1));
  
        // creating a new locale for Spanish Format
        Locale locSpanish = new Locale("es", "ch");
  
        // initializing the date formatter and converting
        // the date
        DateFormat ds = DateFormat.getDateInstance(
                        DateFormat.FULL, locSpanish);
        
        System.out.println("Spanish Format: "
                           + ds.format(d1));
  
        // creating a new locale for chinese Format
        Locale locChinese = new Locale("cn", "ch");
  
        // initializing the date formatter and converting
        // the date
        DateFormat dc = DateFormat.getDateInstance(
                        DateFormat.FULL, locChinese);
        
        System.out.println("Chinese Format: "
                           + dc.format(d1));
    }
}