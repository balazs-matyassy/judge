package hu.progmatic.judge;

import org.springframework.stereotype.Component;

@Component
public class QualityJudge implements Judge {
    @Override
    public int score(Performance performance) {
        return performance.getQuality();
    }
}
