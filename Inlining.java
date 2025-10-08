void main() {
    int foo = foo();
    use(foo); // print Devoxx

    use(foo()); // throw Exception
}

int foo() {
    return 42;
}

void use(int i) {
    IO.println("Devoxx");
}



































void use(Integer i) {
    throw new IllegalArgumentException("JCON");
}
