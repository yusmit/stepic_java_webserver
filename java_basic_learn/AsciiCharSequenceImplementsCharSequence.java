

public class AsciiCharSequence implements CharSequence {
    // implementation
    private final byte value[];
    int start;
    int end;
    
    public AsciiCharSequence(final byte[] value) {
        this.value = value;
    }

    @Override
    public int length() {
        return value.length;
    }

  @Override
  public char charAt(final int index) {
    return (char) value[index];
  }

  @Override
  public CharSequence subSequence(int start, int end) {
        int length = end - start;
        byte[] bytes = new byte[length];
        for (int i = 0, j = start; i < length; i++, j++) {
            bytes[i] = value[j];
        }
        return new AsciiCharSequence(bytes);
    }
    
  @Override
  public String toString() {
    /*final char[] chars = new char[this.chars.length];
    for (int i = 0; i < this.chars.length; i++) {
      chars[i] = (char) this.chars[i];
    }
    
    return new AsciiCharSequence(chars);
    */
      StringBuffer result = new StringBuffer();
      for (int i = 0; i < length(); i++) {
          result.append(charAt(i));
      }
      return result.toString();
  }
}