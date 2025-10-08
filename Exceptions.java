import java.io.IOException;

public class Exceptions {
    @SuppressWarnings("unchecked")
    static <T extends Exception> void throwUnchecked(
            Exception e) throws T {
        throw (T) e;
    }

    void main() {
      throwUnchecked(new IOException("Devoxx"));
    }










































}
