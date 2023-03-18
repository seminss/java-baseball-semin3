package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MyTest {

    @Test
    public void 랜덤한_3자리수_생성(){
        RandomNumGenerator randomNumGenerator = new RandomNumGenerator();
        List<Integer> random= randomNumGenerator.makeRandomNum();

        Assertions.assertThat(random.size()).isEqualTo(3);
    }

}
