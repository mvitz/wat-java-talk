import java.util.Map;

public class Python {

    //  50
    // 100
    //
    static int key, value;

    public static void main(String[] args) {
        int b = value = key = 42;
        //value.setStringTo("foo");= "foo";
        IO.println(b);
        IO.println(key);
        IO.println(value);
        /*
        int a = 2, b = 3;
        StringBuilder c = new StringBuilder()
            .append("c")
            .append(c = new StringBuilder()
                .append("Hallo"));
        if (System.out.append("Hallo\n") == null) {}
        new Foo(42).print(13);
        IO.println(Map.of(
            value = "a", value = "b",
            value = "c", value = "d"));
        IO.println(value);
        IO.println(c);
        */
    }

    public static class Foo {
        private final int i;

        Foo(int i) {
            this.i = i;
        }

        @Override
        public String toString() {
            return "Foo=" + i;
        }

        void print(Foo this, int j) {
            IO.println(this + " " + j);
        }
    }



















































}
