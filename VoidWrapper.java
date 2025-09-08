public interface VoidSupplier<T> extends Function<Void, T>{}
public interface VoidConsumer<T> extends Function<T, Void>{}

void main() {
    VoidSupplier<String> supplier = _ -> "JUG Dortmund";

    VoidConsumer<String> consumer = value -> {
        IO.println(value);
        return g";
    };

    consumer.apply(supplier.apply(null));
}
