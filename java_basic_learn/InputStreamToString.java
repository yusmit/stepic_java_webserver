

private static final int BUFFER_SIZE = 4 * 1024;
public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
    // your implementation here
    StringBuilder builder = new StringBuilder();
    InputStreamReader reader = new InputStreamReader(inputStream, charset);
    char[] buffer = new char[BUFFER_SIZE];
    int length;
    while ((length = reader.read(buffer)) != -1) {
        builder.append(buffer, 0, length);
    }
    return builder.toString();
}