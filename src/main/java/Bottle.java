public class Bottle {
    private int volume;

    public Bottle(int volume){
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public int drinkFromBottle() {
        return this.volume - 10;
    }

    public int empty() {
        int empty = 0;
       return this.volume * empty;
    }

    public int fill() {
        int empty = 0;
        int result = this.volume * empty;
        return result + 100;
    }









}
