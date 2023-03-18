package baseball;

import java.util.ArrayList;
import java.util.List;

public class StringToListConvertor {
    public List<Integer> toList(String answer) {
        List<Integer> answerNum = new ArrayList<>();
        for (int i = 0; i < answer.length(); i++) {
            answerNum.add((int) answer.charAt(i));
        }
        return answerNum;
    }
}
