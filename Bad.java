void main() {
    IO.println(isEven(100_000));
}

boolean isEven(int number) {
    var result = true;
    for (var i = 0; i < Math.abs(number); i++) {
        result = !result;
    }
    return result;
}
