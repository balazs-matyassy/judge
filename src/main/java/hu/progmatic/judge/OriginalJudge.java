package hu.progmatic.judge;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class OriginalJudge implements Judge {
    @Override
    public int score(Performance performance) {
        return performance.getOriginal();
    }
}
