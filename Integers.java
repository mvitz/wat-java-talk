public class Integers {

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
    void main() {
        Integer i = 251;
        Integer j = 251;
        IO.println(1 + 1);
        System.out.println(1 + 1);
        System.out.println((Integer) ((Integer) 1 + (Integer) 1));
    }










































}
