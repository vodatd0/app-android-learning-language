package busuu.company.tandat.busuu.busuu.xmlpaser;

/**
 * Created by Windows 10 Version 2 on 9/4/2016.
 */
public class Vocalbulary {

    private String japanese;
    private String english;
    private String romaji;
    private String illustration;
    private String sound;

    public Vocalbulary(){

    }

    public Vocalbulary(String japanese, String english, String romaji, String illustration, String sound){
        this.japanese = japanese;
        this.english = english;
        this.romaji = romaji;
        this.illustration = illustration;
        this.sound = sound;
    }

    public String getJapanese() {
        return japanese;
    }

    public void setJapanese(String japanese) {
        this.japanese = japanese;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getRomaji() {
        return romaji;
    }

    public void setRomaji(String romaji) {
        this.romaji = romaji;
    }

    public String getIllustration() {
        return illustration;
    }

    public void setIllustration(String illustration) {
        this.illustration = illustration;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
