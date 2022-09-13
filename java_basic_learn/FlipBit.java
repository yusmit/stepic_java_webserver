

/**
 * Flips one bit of the given <code>value</code>.
 *
 * @param value     any number
 * @param bitIndex  index of the bit to flip, 1 <= bitIndex <= 32
 * @return new value with one bit flipped
 */
public static int flipBit(int value, int bitIndex) {
    int cond = (1 << (bitIndex - 1)) & value;
    if (cond > 0) {
        value = value - (1 << (bitIndex - 1));
    }
    else 
        value += (1 << (bitIndex - 1));
    return value;
}