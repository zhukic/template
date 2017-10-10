import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final Input input = new Input(System.in);

        final Args arguments = input.getArgs();

        final Algorithm algorithm = new Algorithm(arguments);

        System.out.println(algorithm.getResult());

    }

    public static class Input {

        private final Scanner input;

        public Input(InputStream inputStream) {
            input = new Scanner(inputStream);
        }

        public Args getArgs() {
            input.close();
            return new Args();
        }

    }

    public static class Args {

    }

    public static class Algorithm {

        public Algorithm(Args args) {}

        public int getResult() {
            return 0;
        }

    }

}
