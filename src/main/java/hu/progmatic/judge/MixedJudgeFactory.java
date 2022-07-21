package hu.progmatic.judge;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MixedJudgeFactory {
    @Bean
    public Judge originalBiased() {
        return new MixedJudge(2, 1);
    }

    @Bean
    public Judge unbiased() {
        return new MixedJudge(1, 1);
    }

    @Bean
    public Judge qualityBiased() {
        return new MixedJudge(1, 2);
    }
}
