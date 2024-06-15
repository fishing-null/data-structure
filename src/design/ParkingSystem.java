package design;

public class ParkingSystem {
    int bigParkingCount;
    int mediumParkingCount;
    int smallParkingCount;

    public ParkingSystem(int big, int medium, int small) {
        this.bigParkingCount = big;
        this.mediumParkingCount = medium;
        this.smallParkingCount = small;
    }

    public boolean addCar(int carType) {
        boolean hasParking = false;
        if(carType == 3){
            //判断一下小车位是否有位置
            if(this.smallParkingCount > 0){
                //判断有位置后,再减少位置
                this.smallParkingCount--;
                hasParking = true;
            }
        }
        if(carType == 2){
            //判断一下中车位是否有位置
            if(this.mediumParkingCount > 0){
                this.mediumParkingCount--;
                hasParking = true;
            }
        }
        if(carType == 1){
            //判断一下大车位是否有位置
            if(this.bigParkingCount > 0){
                this.bigParkingCount--;
                hasParking = true;
            }
        }
        return hasParking;
    }
}
