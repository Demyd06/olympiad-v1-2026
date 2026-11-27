package olympiad_v1.task_3;

/**
 * YOUR WORK HERE
 */
public class ParkingLot {
    private final ParkingSpot[] spots;

    public ParkingLot(ParkingSpot[] spots) {
        this.spots = spots;
    }

    /**
     * Parks the vehicle in the LEAST suitable available spot (spotSize >= vehicle.getSize()).
     * If there are multiple such spots, it selects the first one in the array.
     */
    public boolean parkVehicle(Vehicle vehicle) {
        if (vehicle == null || spots == null) {
            return false;
        }

        for (ParkingSpot spot : spots) {
            if (spot != null && spot.getSpotSize() >= vehicle.getSize()) {
                spot.setParkedVehicle(vehicle);
                return true;
            }
        }
        return false;
    }

    /**
     * Frees the space at spotNumber.
     */
    public boolean leaveSpot(int spotNumber) {
        // TODO: implement me
        return false;
    }

    /**
     * Returns the number of free spaces of the exact specified size `size`.
     */
    public int getAvailableSpotsCount(int size) {
        // TODO: implement me
        return 0;
    }
}
