public class MicroBlog {

    private static final int MAX_POST_LENGTH = 5;
    public String truncate(final String input) {
        return input.codePoints()
                .limit(MAX_POST_LENGTH)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}

