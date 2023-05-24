import static org.junit.jupiter.api.Assertions.*;

public class NumerosConverterTest {
    @org.junit.jupiter.api.Test
    void convert() {
        NumerosConverter numerosConverter = new NumerosConverter();

        assertEquals(numerosConverter.convert("V"), 5);
        assertEquals(numerosConverter.convert("X"), 10);
        assertEquals(numerosConverter.convert("IV"), 4);
        assertEquals(numerosConverter.convert("XIX"), 19);
        assertEquals(numerosConverter.convert("XVIII"), 18);
        assertEquals(numerosConverter.convert("CXX"), 120);

        assertThrows(NumeroNoValidoException.class, () -> numerosConverter.convert("XM"));
        assertThrows(NumeroNoValidoException.class, () -> numerosConverter.convert("XM"));
    }
}
