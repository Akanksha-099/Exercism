public class LogLevels {


    public static String message(String logLine) {
        int indexOfTwoDots = logLine.indexOf(":");
        return logLine.substring(indexOfTwoDots + 1, logLine.length()).trim();
    }
    public static String logLevel(String logLine) {
        int indexOfTwoDots = logLine.indexOf(":");
        return logLine.substring(1, indexOfTwoDots - 1).toLowerCase();
    }
    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
