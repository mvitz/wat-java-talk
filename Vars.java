void main() {
    var o = new Object() {
        void print() {
            IO.println("Hallo");
        }
    };
    o.print();
    o = new Object() {
        void print() {
            IO.println("Hallo");
        }
    };
}
