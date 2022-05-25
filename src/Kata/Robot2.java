package Kata;

public class Robot2 {
    public interface RobotConnection extends AutoCloseable {
        void moveRobotTo(int x, int y);

        @Override
        void close();
    }

    public interface RobotConnectionManager {
        RobotConnection getConnection();
    }

    public class RobotConnectionException extends RuntimeException {

        public RobotConnectionException(String message) {
            super(message);

        }

        public RobotConnectionException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {


        for (int i = 0; i <= 3; i++) {
            try (RobotConnection connect = robotConnectionManager.getConnection()) {
                connect.moveRobotTo(toX, toY);
                i = 3;
            } catch (RobotConnectionException e) {
                if (i == 2) {
                    throw e;
                }
            }
        }
    }
}
