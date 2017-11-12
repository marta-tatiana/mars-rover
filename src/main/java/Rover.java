public class Rover {

    public Position execute(Command cmd) {
        return cmd.execute();
    }
}
