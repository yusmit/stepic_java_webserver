
public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
    boolean success = false;
    for (int i = 0; !success && (i < 3); ++i) {
        try (RobotConnection connection = robotConnectionManager.getConnection()) {
            connection.moveRobotTo(toX, toY);
            success = true;
        } catch (RobotConnectionException e) {}
    }
    if (!success) {
        throw new RobotConnectionException("3 attempts failed");
    }
}