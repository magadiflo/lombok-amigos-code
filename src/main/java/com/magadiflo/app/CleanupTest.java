package com.magadiflo.app;

import lombok.Cleanup;

import java.io.*;

/***
 * @Cleanup
 * Le dirá al Proyecto Lombok que cierre automáticamente este recurso una vez que ya no esté en uso en el ámbito
 * actual como FileInputStream. Asegura que la declaración de variable que anota se limpiará llamando a su método
 * de cierre, independientemente de lo que suceda.
 */

public class CleanupTest {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        @Cleanup
        InputStream in = new FileInputStream("input.txt");

        @Cleanup
        OutputStream out = new FileOutputStream("output.txt");
    }
}
