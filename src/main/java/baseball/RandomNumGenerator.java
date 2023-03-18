package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;


public class RandomNumGenerator {
    List<Integer> randomNum = new ArrayList<>();
    public List<Integer> makeRandomNum(){
        while (randomNum.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!randomNum.contains(randomNumber)) {
                randomNum.add(randomNumber);
            }
        }
        return randomNum;
    }

    public void clearRandomNum(){
        randomNum.clear();
    }

}
