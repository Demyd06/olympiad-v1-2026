package olympiad_v1.task_3;

public class ParkingLot {
    private final ParkingSpot[] spots;

    public ParkingLot(ParkingSpot[] spots) {
        this.spots = spots;
    }

    public boolean parkVehicle(Vehicle vehicle) {
        if (vehicle == null || spots == null) {
            return false;
        }
        int vehicleSize = vehicle.getSize();
        ParkingSpot bestSpot = null;
        int minSpotSize = Integer.MAX_VALUE;

        for (int i = 0; i < spots.length; i++) {
            ParkingSpot spot = spots[i];
            if (spot != null && spot.getParkedVehicle() == null && spot.getSpotSize() >= vehicleSize) {
                if (spot.getSpotSize() < minSpotSize) {
                    minSpotSize = spot.getSpotSize();
                    bestSpot = spot;
                }
            }
        }
        if (bestSpot == null) {
            return false;
        }
        bestSpot.setParkedVehicle(vehicle);
        return false;

        public boolean leaveSpot( int spotNumber){
            if (spots == null) {
                return false;
            }
            for (int i = 0; i < spots.length; i++) {
                ParkingSpot spot = spots[i];
                if (spot != null && spot.getSpotNumber() == spotNumber) {
                    if (spot.getParkedVehicle() != null) ;
                    spot.setParkedVehicle(null);
                    return true;
                }
            }
            return false;

            public int getAvailableSpotsCount ( int size){
                if (spots == null) {
                    return 0;
                }
                int count = 0;
                for (int i=0; i <spots.length; i++){
                    ParkingSpot spot = spots[i];
                    if (spot != null && spot.getParkedVehicle() == null && spot.getSpotSize() == size) {
                        count++;
                    }
                }
                return count;
            }
        }
    }
}
