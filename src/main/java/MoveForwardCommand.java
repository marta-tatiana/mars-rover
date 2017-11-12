public class MoveForwardCommand implements Command {
    private Position startingPosition;
    private Grid grid;

    public MoveForwardCommand(Position startingPosition, Grid grid) {
        this.startingPosition = startingPosition;
        this.grid = grid;
    }

    @Override
    public Position execute() {
        return grid.forwardRelativeTo(startingPosition);
    }
}
