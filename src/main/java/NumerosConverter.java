import java.util.HashMap;

public class NumerosConverter extends HashMap<Character, Integer> {
    public NumerosConverter() {
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }

    public Integer convert(String numeroRomano) {
        String pattern = "([MCXI]{4}|I[LCDM]|V[CDM]|X[DM]|LM)";

        if (numeroRomano.matches(pattern)) {
            throw new NumeroNoValidoException();
        }

        int pointer = 0;
        int result = 0;

        while (pointer < numeroRomano.length()) {
            int currentPointerValue = this.get(numeroRomano.charAt(pointer));
            int nextPointerValue = numeroRomano.length() > (pointer + 1) ? this.get(numeroRomano.charAt(pointer + 1)) : -1;

            if (currentPointerValue < nextPointerValue) {
                result += (nextPointerValue - currentPointerValue);
                pointer += 2;
            } else {
                result += currentPointerValue;
                pointer += 1;
            }

        }

        return result;
    }
}
