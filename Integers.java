public class Integers {

    void main() {
        Integer i = 127;
        Integer j = 127;
        IO.println(i == j);
    }










































    static {
        try {
            var clazz = Class.forName("java.lang.Integer$IntegerCache");

            var field = clazz.getDeclaredField("cache");
            field.setAccessible(true);

            var cache = (Integer[]) field.get(clazz);
            //IO.println(cache[129]);
            //cache[129] = 21;
            //IO.println(cache[130]);
            cache[130] = 42;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
