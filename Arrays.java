@Foo java.lang.@Foo String@Nullable[@NonNull String[]] array = { "JUG Dortmund" };

String foo() [] {
    return array;
}

void main() {
    var array = foo();
    IO.println(Arrays.asList(array));
}
