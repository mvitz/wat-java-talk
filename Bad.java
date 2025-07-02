void main() {
    IO.println(isEven(42));
}

boolean isEven(int number) {
    var result = true;
    for (var i = 0; i < Math.abs(number); i++) {
        result = !result;
    }
    return result;
}
