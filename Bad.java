void main() {
    IO.println(whatDoesThisPrint(42));
}

boolean whatDoesThisPrint(int number) {
    var result = true;
    for (var i = 0; i < Math.abs(number); i++) {
        result = !result;
    }
    return result;
}
