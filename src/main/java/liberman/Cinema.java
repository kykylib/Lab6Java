package liberman;

public class Cinema {
    private final int place;
    private final int row;
    private final int column;
    private final int[][][] cinemaArray;

    public Cinema(int place, int row, int column) {
        this.place = place;
        this.row = row;
        this.column = column;
        this.cinemaArray = new int[place][row][column];

        for (int i = 0; i < place; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < column; k++) {
                    cinemaArray[i][j][k] = 0;
                }
            }
        }
    }


}
