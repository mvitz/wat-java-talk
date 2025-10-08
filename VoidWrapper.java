void main() {
    Supplier<String> supplier = () -> "Devoxx";

    Consumer<String> consumer = value -> {
        IO.println(value);
    };

    consumer.accept(supplier.get());
}
