import java.util.Map;

public class Python {


    public static class Foo {
        private final int i;

        public Foo(int i) {
            this.i = i;
        }

        public void print(Foo that, int j) {
            IO.println(that + " " + j);
        }

        public String toString() {
            return "Foo[" + i + "]";
        }
    }

    static String key, value;

    public static void main(String[] args) {
        new Foo(42).print(new Foo(13), 7);
        IO.println(Map.of(
            key = key = "a", value = "b",
            value = "foo", value = "bar"));
    }



























































































}
