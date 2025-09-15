import java.util.Map;

public class Python {

    static String key, value;

    public static void main(String[] args) {
        new Foo(42).print(13);
        System.out.println(
            Map.of(value = "a", key = "foo", key = "b", value = "bar")
        );
    }

    public static class Foo {
        private final int i;

        Foo(int i) {
            this.i = i;
        }

        void print(/*@JustOnServer*/ Foo this, int j) {
            System.out.println("this=" + this.i + ", j=" + j);
        }

        public String toString() {
            return "This=" + this.i;
        }
    }



























































































}
