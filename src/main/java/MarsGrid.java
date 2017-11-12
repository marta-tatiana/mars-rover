public class MarsGrid implements Grid {

    private final static int MAX_X = 5;
    private final static int MAX_Y = 5;

    @Override
    public Position forwardRelativeTo(Position startingPosition) {
        switch (startingPosition.getDirection()) {
            case NORTH:
                return new Position(startingPosition.getX(), (startingPosition.getY()-1)%MAX_X, Direction.NORTH);
            case SOUTH:
                return new Position(startingPosition.getX(), (startingPosition.getY()+1)%MAX_X, Direction.NORTH);
            case WEST:
                return new Position((startingPosition.getX()-1)%MAX_Y, startingPosition.getY(), Direction.NORTH);
            default:
                return new Position((startingPosition.getX()+1)%MAX_Y, startingPosition.getY(), Direction.NORTH);
        }
    }
}
