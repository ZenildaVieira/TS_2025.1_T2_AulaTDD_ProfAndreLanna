package tst;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import app.IRPF;

public class CadastroRendimentoTest {

    private IRPF irpf;

    @Before
    public void setup() {
        irpf = new IRPF();
    }

    @Test
    public void testCadastrarSalario() {
        irpf.cadastrarSalario(5000f);
        assertEquals(5000f, irpf.getTotalSalario(), 0);
        // fail("Not yet implemented");
    }

}
