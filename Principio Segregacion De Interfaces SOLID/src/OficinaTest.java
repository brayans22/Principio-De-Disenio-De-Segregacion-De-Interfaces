import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OficinaTest {

    @Test
    void test01seImprimeUnDocumentoCorrectamente(){
        Impresora i = new Impresora();
        assertEquals("Se imprimio correctamente el documento", i.imprimir());
    }
    @Test
    void test02seScanneaUnDocumentoCorrectamente(){
        Scanner s = new Scanner();
        assertEquals("Se escaneo correctamente el documento", s.scannear());
    }
    @Test
    void test03seFotocopiaUnDocumentoCorrectamente(){
        Fotocopiadora f = new Fotocopiadora();
        assertEquals("Se fotocopio correctamente el documento", f.fotocopiar());
    }

}
