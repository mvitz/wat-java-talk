import java.io.IOException;

public class Exceptions {

    // 50
    void main() {
      throw new IOException("JUG Dortmund");
    }









































    @SuppressWarnings("unchecked")
    static <T extends Exception> void throwUnchecked(
            Exception e) throws T {
        throw (T) e;
    }
}
