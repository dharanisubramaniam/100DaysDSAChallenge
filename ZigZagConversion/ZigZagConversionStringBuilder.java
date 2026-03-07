public String convert(String s, int numRows) {
    if (numRows == 1 || s.length() <= numRows) return s;

    // Create a list of StringBuilders (our "buckets")
    StringBuilder[] rows = new StringBuilder[numRows];
    for (int i = 0; i < numRows; i++) rows[i] = new StringBuilder();

    int currRow = 0;
    boolean goingDown = false;

    for (char c : s.toCharArray()) {
        rows[currRow].append(c);
        
        // Bounce logic: flip direction at top and bottom
        if (currRow == 0 || currRow == numRows - 1) {
            goingDown = !goingDown;
        }
        
        currRow += goingDown ? 1 : -1;
    }

    // Combine all buckets into one string
    StringBuilder result = new StringBuilder();
    for (StringBuilder row : rows) result.append(row);
    
    return result.toString();
}