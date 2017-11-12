public class Position {
    private final int x;
    private final int y;
    private final Direction direction;

    public Position(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Position)) return false;
        Position otherOne = (Position)o;
        return this.x == otherOne.x && this.y == otherOne.y && this.direction == otherOne.direction;
    }

    public int hashCode() {
        return new Integer(x).hashCode() + new Integer(y).hashCode() - direction.hashCode();
    }

    public String toString() {
        return "X: " + x + ", Y:" + y + ", Direction: " + direction;
    }
}
