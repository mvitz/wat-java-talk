void main() {
    IO.println(EmptyEnum.square(42));
}

public final class EmptyEnum {
    private EmptyEnum() {}

    public static int square(int i) {
        return i * i;
    }
}
