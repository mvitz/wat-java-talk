String[] array = { "Devoxx" };

String foo() [] {
    return array;
}

void main() {
    var array = foo();
    IO.println(Arrays.asList(array));
}
