package Klausuren.September_2022.Aufgabe_008;

import java.io.IOException;
import java.io.InputStream;
import java.util.function.IntPredicate;

public class FilteredInputStream {
    private final InputStream is;
    protected final IntPredicate filter;

    public FilteredInputStream(InputStream is, IntPredicate filter) {
        this.is = is;
        this.filter = filter;
    }

    /*Liefert nächsten Bytewert des Eingabestroms für den das
    Filterkriterium erfüllt ist. Wenn Kriterium nicht erfüllt oder kein
    Wert, dann ist die Ausgabe -1.*/
    public int read() throws IOException {
        int tmp;
        int bytes = 0;
        while ((tmp = is.read()) != -1) {
            bytes += tmp;
            if (!filter.test(tmp)) {
                return -1;
            }
        }
        return bytes;
    }
}
