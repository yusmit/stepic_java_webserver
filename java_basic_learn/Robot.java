

public static void moveRobot(Robot robot, int toX, int toY) {
    int x = robot.getX();
    int y = robot.getY();
    
    //1 quadrant
    if (x >= toX && y >= toY) { 
        
        //turn robot left, since it's to the right side of toX coordinate
        while (!(robot.getDirection() == Direction.LEFT)) { //while not looking left
            robot.turnRight();
        }
        //move to right x coordinate     
        while (!(robot.getX() == toX)) {
            robot.stepForward();
        }
        
        //turn robot down, sice it's upper than toY
        while (!(robot.getDirection() == Direction.DOWN)) { //while not looking left
            robot.turnRight();
        }
        //move to right y coordinate       
        while (!(robot.getY() == toY)) {
            robot.stepForward();
        }
        
    }
               
    //2 quadrant
    else if (x >= toX && y <= toY) { 
        
        //turn robot left, since it's to the right side of toX coordinate
        while (!(robot.getDirection() == Direction.LEFT)) { //while not looking left
            robot.turnRight();
        }
        //move to right x coordinate     
        while (!(robot.getX() == toX)) {
            robot.stepForward();
        }
        
        //turn robot down, sice it's lower than toY
               while (!(robot.getDirection() == Direction.UP)) { //while not looking left
            robot.turnRight();
        }
        //move to right y coordinate       
        while (!(robot.getY() == toY)) {
            robot.stepForward();
        }
    }
    
    //3 quadrant
    else if (x <= toX && y <= toY) { 
        
        //turn robot left, since it's to the left of toX coordinate
        while (!(robot.getDirection() == Direction.RIGHT)) { //while not looking right
            robot.turnRight();
        }
        //move to right x coordinate     
        while (!(robot.getX() == toX)) {
            robot.stepForward();
        }
        
        //turn robot down, sice it's lower than toY
        while (!(robot.getDirection() == Direction.UP)) { //while not looking left
            robot.turnRight();
        }
        //move to right y coordinate       
        while (!(robot.getY() == toY)) {
            robot.stepForward();
        }
    }
               
    //4 quadrant
    else if (x <= toX && y >= toY) { 
        
        //turn robot left, since it's to the right side of toX coordinate
        while (!(robot.getDirection() == Direction.RIGHT)) { //while not looking right
            robot.turnRight();
        }
        //move to right x coordinate     
        while (!(robot.getX() == toX)) {
            robot.stepForward();
        }
        
        //turn robot down, sice it's upper than toY
        while (!(robot.getDirection() == Direction.DOWN)) { //while not looking left
            robot.turnRight();
        }
        //move to right y coordinate       
        while (!(robot.getY() == toY)) {
            robot.stepForward();
        }
    }               
               
}