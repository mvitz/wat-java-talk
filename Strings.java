public class Strings {

    void main() {
        var location = "Dortmund";
        IO.println(location);
        var location2 = new String("Dortmund");
        replaceWith("Dortmund", "Gelsenkirchen");
        IO.println(location);
        IO.println(location2);
        IO.println(new String(location));
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
