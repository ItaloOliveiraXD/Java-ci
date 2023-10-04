import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testSoma() {
        int valor1 = 5;
        int valor2 = 5;
        int valorEsperado = 10;
        int resultado = FuncSoma.soma(valor1, valor2);

        assertEquals(valorEsperado, resultado, 0);
    }
}
