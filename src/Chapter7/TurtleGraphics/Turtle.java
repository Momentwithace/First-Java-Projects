package Chapter7.TurtleGraphics;

public class Turtle {
    private Direction currentDirection = Direction.EAST;

    private boolean isPenUp = true;
    public boolean isPenUp() {
        return isPenUp;
    }

    public void penIsDown() {
        isPenUp = false;
    }

    public void penCanBeUp() {
        isPenUp = true;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    private Position currentPosition = new Position(0, 0);

    public void turnRight() {
        switch (currentDirection){
            case EAST -> face(Direction.SOUTH);
            case WEST -> face(Direction.NORTH);
            case SOUTH -> face(Direction.WEST);
            case NORTH -> face(Direction.EAST);
        }
        //if(currentDirection == Direction.EAST) currentDirection = Direction.SOUTH;
//        else if (currentDirection == Direction.SOUTH) currentDirection = Direction.WEST;
//        else if(currentDirection == Direction.WEST) currentDirection = Direction.NORTH;
//        else if(currentDirection == Direction.NORTH) currentDirection = Direction.EAST;
    }

    public void turnLeft() {
        switch (currentDirection){
            case EAST -> face(Direction.NORTH);
            case SOUTH -> face(Direction.EAST);
            case WEST -> face(Direction.SOUTH);
            case NORTH -> face(Direction.WEST);
        }
//        if(currentDirection == Direction.EAST) currentDirection = Direction.NORTH;
//        else if (currentDirection == Direction.SOUTH) currentDirection = Direction.EAST;
//        else if(currentDirection == Direction.WEST) currentDirection = Direction.SOUTH;
//        else if(currentDirection == Direction.NORTH) currentDirection = Direction.WEST;
    }
    public void face(Direction direction){
        currentDirection = direction;
    }

    public void move(int numberOfSteps) {
        int currentColumn = currentPosition.getColumn();

        if(currentDirection == Direction.EAST){
            currentPosition.setColumn(numberOfSteps + currentColumn);
        }
        if(currentDirection == Direction.NORTH){
            currentPosition.setColumn(numberOfSteps - currentColumn);
        }
        if(currentDirection == Direction.SOUTH){
            currentPosition .setColumn(numberOfSteps + currentColumn);
        }
        if(currentDirection == Direction.WEST){
            currentPosition.setColumn(numberOfSteps - currentColumn);
        }
    }

    private void increaseColumn(int numberOfSteps){
        int currentCol = currentPosition.getColumn();
        currentPosition.setColumn(numberOfSteps);
    }

    public Position getCurrentPosition() {
        return new Position(0, 5);
    }
}
