public class Strings {

    void main() {
        IO.println("Hello");
    }












































    static {
        replaceWith("Hello", "Devoxx");
    }















































    static void replaceWith(
            String target,
            String replacement) {
        try {
            var value = String.class.getDeclaredField("value");
            value.setAccessible(true);
            value.set(target, replacement.getBytes());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }







































}
