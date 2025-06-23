class Solution {
    public int numSpecial(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int count = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // If the current element is 0, it can't be special, so skip it.
                if (mat[i][j] == 0) {
                    continue;
                }

                boolean special = true;

                // --- Check Column ---
                // Iterate through all rows in the current column (j)
                for (int r = 0; r < row; r++) {
                    // If there's another '1' in the same column (but different row), it's not special.
                    if (r != i && mat[r][j] == 1) {
                        special = false;
                        break; // No need to check further in this column
                    }
                }

                // If it's already not special from the column check, no need to check the row.
                if (!special) {
                    continue;
                }

                // --- Check Row ---
                // Iterate through all columns in the current row (i)
                for (int c = 0; c < col; c++) { // Corrected loop condition: should go up to 'col'
                    // If there's another '1' in the same row (but different column), it's not special.
                    if (c != j && mat[i][c] == 1) {
                        special = false;
                        break; // No need to check further in this row
                    }
                }

                // If both checks pass, it's a special position.
                if (special) {
                    count++;
                }
            }
        }
        return count;
    }
}