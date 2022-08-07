public class Passanger {
    private String FirstName=null;
    private String SecondName=null;
    private String VehicleNum=null;
    private int NumOfLiters=0;

    //assigning the variables

//setters
    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public void setVehicleNum(String VehicleNum) {
        this.VehicleNum = VehicleNum;
    }

    public void setSecondName(String secondName) {
        this.SecondName = secondName;
    }

    public void setNumofLiters(int NumOfLiters) {
        this.NumOfLiters = NumOfLiters;
    }

//getters
    public String getFirstName() {
        return FirstName;
    }
    public String getSecondName(){
        return  SecondName;
    }
    public  String getVehicleNum(){
        return VehicleNum;
    }
    public  int getNumOfLiters(){
        return NumOfLiters;
    }



}
