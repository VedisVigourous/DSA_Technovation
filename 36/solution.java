class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') {
                    continue;
                }

                int numIdx = board[r][c] - '1';
            
                int boxIdx = (r / 3) * 3 + (c / 3);

                if (rows[r][numIdx] || cols[c][numIdx] || boxes[boxIdx][numIdx]) {
                    return false;
                }

                rows[r][numIdx] = true;
                cols[c][numIdx] = true;
                boxes[boxIdx][numIdx] = true;
            }
        }
        return true;
    }
}