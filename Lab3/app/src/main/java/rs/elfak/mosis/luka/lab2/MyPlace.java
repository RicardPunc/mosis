package rs.elfak.mosis.luka.lab2;

public class MyPlace {
    String name;
    String description;

    public MyPlace(String nme, String desc){
        this.name = nme;
        this.description = desc;
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
