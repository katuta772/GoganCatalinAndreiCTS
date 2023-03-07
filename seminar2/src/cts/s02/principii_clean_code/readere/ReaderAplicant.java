package cts.s02.principii_clean_code.readere;

import cts.s02.principii_clean_code.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class ReaderAplicant {
    public abstract List<Aplicant> readAplicant(String file) throws FileNotFoundException;

    public void readAplicant(Aplicant aplicant, Scanner scanner){
        aplicant.setNume(scanner.next());
        aplicant.setPrenume(scanner.next());
        aplicant.setVarsta(scanner.nextInt());
        aplicant.setPunctajObtinut(scanner.nextInt());
        int numarProiecte = scanner.nextInt();
        String[] denumiriProiecte = new String[numarProiecte];
        for (int i = 0; i < numarProiecte; i++) {
            denumiriProiecte[i] = scanner.next();
        }
        aplicant.setNrProiecte(numarProiecte, denumiriProiecte);
    }
}
