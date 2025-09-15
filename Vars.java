import java.util.ArrayList;
void main() {
    var o = new Object() {
        void print() {
            IO.println("Hallo");
        }
    };
    var l = new ArrayList<String>() {{
        add("Foo");
    }};
    IO.println(l);
    l = new ArrayList<String>();
}
