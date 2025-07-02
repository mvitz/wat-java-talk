void main() {
    IO.println(EmptyEnum.square(42));
}

public enum EmptyEnum {
    ;

    public static int square(int i) {
        return i * i;
    }
}
