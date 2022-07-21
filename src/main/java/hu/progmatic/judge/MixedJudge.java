package hu.progmatic.judge;

public class MixedJudge implements Judge {
    private int originalWeight, qualityWeight;

    public MixedJudge() {
    }

    public MixedJudge(int originalWeight, int qualityWeight) {
        this.originalWeight = originalWeight;
        this.qualityWeight = qualityWeight;
    }

    @Override
    public int score(Performance performance) {
        return (performance.getOriginal() * originalWeight +
                performance.getQuality() * qualityWeight) / (originalWeight + qualityWeight);
    }
}
