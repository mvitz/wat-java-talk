public class Strings {

    static {
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
    void main() {
        var hello = "Hello";
        var hello2 = new String("Hello");
        replaceWith("Hello", "Devoxx");
        IO.println(hello);
        IO.println(hello2);
    }


































































































































}
