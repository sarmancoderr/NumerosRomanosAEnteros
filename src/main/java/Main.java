public class Main {
    public static void main(String[] args) {
        NumerosConverter numerosConverter = new NumerosConverter();

        try {
            System.out.println(numerosConverter.convert("X"));
            System.out.println(numerosConverter.convert("V"));
            System.out.println(numerosConverter.convert("IV"));
            System.out.println(numerosConverter.convert("XIX"));
            System.out.println(numerosConverter.convert("IM"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(numerosConverter.convert("XM"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
