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
        // TODO: implement me
        if (vehicle == null || spots == null){
            return false;

        }

        ParkingSpot bestSpot = null;

        for (int i = 0; i < spots.length; i++) {
            ParkingSpot spot = spots[i];
            if (spot.getParkedVehicle() == null && spot.getSpotSize() >= vehicle.getSize()){
                if (bestSpot == null || spot.getSpotSize() < bestSpot.getSpotSize()){
                    bestSpot = spot;
                }
            }

        }

        if (bestSpot != null){
            bestSpot.setParkedVehicle(vehicle);
            return true;
        }
        return false;
    }



    /**
     * Frees the space at spotNumber.
     */
    public boolean leaveSpot(int spotNumber) {
        // TODO: implement me
        if (spots == null){
            return false;
        }
        for (int i = 0; i < spots.length; i++) {
            ParkingSpot spot = spots[i];
            if (spot.getSpotNumber() == spotNumber && spot.getParkedVehicle() != null){
                spot.setParkedVehicle(null);
                return true;
            }

        }
        return false;
    }

    /**
     * Returns the number of free spaces of the exact specified size `size`.
     */
    public int getAvailableSpotsCount(int size) {
        // TODO: implement me
        if (spots == null){
            return 0;
        }
        int count = 0;
        for (int i = 0; i < spots.length; i++) {
            ParkingSpot spot = spots[i];

            if (spot.getParkedVehicle() == null && spot.getSpotSize() == size){
                count ++;
            }

        }

        return count;
    }

    public static void main(String[] args) {
        ParkingSpot [] spots = {
                new ParkingSpot(1, 3),
                new ParkingSpot(2, 1),
                new ParkingSpot(3, 2),
                new ParkingSpot(4, 1)};
        ParkingLot parkingLot = new ParkingLot(spots);
        Vehicle vehicle = new Vehicle("AA1234AA", 1);
        System.out.println(parkingLot.parkVehicle(vehicle));
        System.out.println(parkingLot.getAvailableSpotsCount(1));
        System.out.println(parkingLot.leaveSpot(2));
        System.out.println(parkingLot.getAvailableSpotsCount(1));
    }
}
