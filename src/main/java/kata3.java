/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saul
 */
public class kata3 {
    
    public static void main(String[] args) {
        Histogram<String> histo = new Histogram<>();

        histo.increment("ulpgc.es");
        histo.increment("ulpgc.es");
        histo.increment("ulpgc.es");
        histo.increment("ulpgc.es");

        histo.increment("google.com");
        histo.increment("google.com");
        histo.increment("google.com");
        histo.increment("google.com");
        histo.increment("google.com");
        
        histo.increment("hotmail.es");
        histo.increment("hotmail.es");
        
        new HistogramDisplay(histo).execute();
    }

    
}
