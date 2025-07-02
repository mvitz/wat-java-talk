void main() {
    Supplier<String> supplier = () -> "JUG Dortmund";

    Consumer<String> consumer = value -> {
        IO.println(value);
    };

    consumer.accept(supplier.get());
}
