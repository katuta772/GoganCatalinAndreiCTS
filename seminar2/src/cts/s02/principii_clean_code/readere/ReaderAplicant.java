package cts.s02.principii_clean_code.readere;

import cts.s02.principii_clean_code.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public abstract class ReaderAplicant {
    public abstract List<Aplicant> readAplicant(String file) throws FileNotFoundException;

}
