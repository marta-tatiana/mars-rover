import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class RoverShould {

    @Test public void
    moveForward() {
        Grid grid = new MarsGrid();
        Position initialPosition = new Position(0,1, Direction.NORTH);
        Rover rover = new Rover();
        Command cmd = new MoveForwardCommand(initialPosition, grid);
        Position newPosition = rover.execute(cmd);
        assertThat(newPosition, equalTo(new Position(0, 0, Direction.NORTH)));
    }
}
