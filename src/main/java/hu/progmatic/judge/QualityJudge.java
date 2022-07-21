package hu.progmatic.judge;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// Ebből az osztályból létrejön egy bean.
// Az osztály egyetlen példánya (objektuma) lesz a bean, nem maga az osztály.
@Component
@Primary
public class QualityJudge implements Judge {
    @Override
    public int score(Performance performance) {
        return performance.getQuality();
    }
}
