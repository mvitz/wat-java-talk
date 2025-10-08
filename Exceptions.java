import java.io.IOException;

public class Exceptions {

    void main() {
      throw new IOException("Devoxx");
    }










































    @SuppressWarnings("unchecked")
    static <T extends Exception> void throwUnchecked(
            Exception e) throws T {
        throw (T) e;
    }
}
