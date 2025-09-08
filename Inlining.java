//  50

void main() {
    int foo = foo();
    use(foo); // print JUG Dortmund

    use(foo()); // throw Exception
}

Integer foo() {
    return 42;
}

void use(int i) {
    IO.println("JUG Dortmund");
}

void use(Integer i) {
    throw new IllegalArgumentException("JCON");
}
