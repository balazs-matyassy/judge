package hu.progmatic.judge;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

// Ebből az osztályból létrejön egy bean.
// Az osztály egyetlen példánya (objektuma) lesz a bean, nem maga az osztály.
@Component
public class MainRunner implements CommandLineRunner {
    private Judge judge;

    public MainRunner(@Qualifier("originalJudge") Judge judge) {
        this.judge = judge;
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mennyire volt eredeti az előadás?");
        int original = scanner.nextInt();
        System.out.println("Milyen minőségű volt az előadás?");
        int quality = scanner.nextInt();

        Performance performance = new Performance(original, quality);
        int score = judge.score(performance);

        System.out.println("Elért pontszám: " + score);
    }
}
