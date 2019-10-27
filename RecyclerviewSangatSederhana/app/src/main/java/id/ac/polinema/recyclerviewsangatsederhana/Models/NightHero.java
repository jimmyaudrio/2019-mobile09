package id.ac.polinema.recyclerviewsangatsederhana.Models;

public class NightHero {
    public String nightName;
    public String photoName;

    public NightHero(String nightName, String photoName){
        this.nightName = nightName;
        this.photoName = photoName;
    }


    public String getNightName() {
        return nightName;
    }

    public void setNightName(String dummyName) {
        this.photoName = dummyName;
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }
}
