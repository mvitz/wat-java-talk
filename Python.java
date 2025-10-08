import java.util.Map;

public class Python {

    public static class This {

        void print(This this, int i) {
            IO.println(this + " " + i);
        }
    }

    static String key, value;

    public static void main(String[] args) {
        IO.println(
            Map.of(
                key = "a", value = "1",
                value = value = value = "b", value = "2"));
        new This().print(42);
    }



























































































}
