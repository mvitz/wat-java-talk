public class Strings {

    //  50
    // 100
    // 150

    void main() {
        String location = "Dortmund";
        String location2 = new String(location);
        replaceWith(location, "Gelsenkirchen");
        IO.println(location);
        IO.println(location2);
    }

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







































}
