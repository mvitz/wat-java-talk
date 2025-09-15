public class Strings {

    static {
        //replaceWith("Dortmund", "Gelsenkirchen");
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
        var location = "Dortmund";
        var location2 = "Dortmund";

        replaceWith("Dortmund", "Gelsenkirchen");

        IO.println(location);
        IO.println(location2);
    }


































































































































}
