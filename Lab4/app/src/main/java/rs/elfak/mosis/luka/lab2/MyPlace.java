package rs.elfak.mosis.luka.lab2;

public class MyPlace {
    String name;
    String description;
    String latitude;
    String longitude;
    int ID;

    public MyPlace(String nme, String desc){
        this.name = nme;
        this.description = desc;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public MyPlace(String nme){
        this(nme, "");
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return description;
    }

    public void setDesc(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
