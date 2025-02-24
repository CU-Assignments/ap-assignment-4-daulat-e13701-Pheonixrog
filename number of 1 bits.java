public int hammingWeight(int n) {
    int c = 0;             // Counter for the number of 1 bits.
    while (n != 0) {
        // Check if the least significant bit is 1.
        if ((n & 1) == 1) {
            c++;
        }
        // Right shift n by 1 bit to check the next bit.
        n = n >> 1;
    }
    return c;
}
