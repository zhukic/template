import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final Input input = new Input(System.in);

        final Input.Args arguments = input.getArgs();

        final Algorithm algorithm = new Algorithm();

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

        public static class Args {

        }

    }

    public static class Algorithm {

        public Algorithm() {}

        public int getResult() {
            return 0;
        }

    }

}
