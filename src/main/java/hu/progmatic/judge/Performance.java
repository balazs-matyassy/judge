package hu.progmatic.judge;

public class Performance {
    private int original;

    private int quality;

    public Performance() {
    }

    public Performance(int original, int quality) {
        this.original = original;
        this.quality = quality;
    }

    public int getOriginal() {
        return original;
    }

    public void setOriginal(int original) {
        this.original = original;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
}
