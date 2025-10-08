public interface VoidSupplier<T> extends Function<Void, T>{}
public interface VoidConsumer<T> extends Function<T, Void>{}

void main() {
    VoidSupplier<String> supplier = (_) -> "Devoxx";

    VoidConsumer<String> consumer = value -> {
        IO.println(value);
        return null;
    };

    consumer.apply(supplier.apply(null));
}
