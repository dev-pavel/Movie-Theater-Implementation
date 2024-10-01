class Seat {
    private boolean reserved;

    public Seat() {
        this.reserved = false;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void reserve() {
        if (!reserved) {
            reserved = true;
            System.out.println("Seat reserved successfully.");
        } else {
            System.out.println("Seat is already reserved.");
        }
    }

    public void cancel() {
        if (reserved) {
            reserved = false;
            System.out.println("Reservation canceled.");
        } else {
            System.out.println("Seat is not reserved.");
        }
    }

    @Override
    public String toString() {
        return reserved ? "[X]" : "[O]";
    }
}