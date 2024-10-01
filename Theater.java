class Theater {
    private Seat[][] seats;
    private int rows;
    private int columns;

    public Theater(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        seats = new Seat[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                seats[i][j] = new Seat();
            }
        }
    }

    public void displaySeatingChart() {
        System.out.println("Seating Chart:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void reserveSeats(int row, int col) {
        if (isValidSeat(row, col)) {
            seats[row][col].reserve();
        } else {
            System.out.println("Invalid seat selection.");
        }
    }

    public void cancelSeats(int row, int col) {
        if (isValidSeat(row, col)) {
            seats[row][col].cancel();
        } else {
            System.out.println("Invalid seat selection.");
        }
    }

    private boolean isValidSeat(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < columns;
    }
}