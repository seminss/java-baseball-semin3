package baseball;

import java.util.ArrayList;
import java.util.List;

public class StringToListConvertor {
    public List<Integer> convert(String answer) {
        List<Integer> answerNum = new ArrayList<>();
        for (int i = 0; i < answer.length(); i++) {
            answerNum.add(Integer.parseInt(String.valueOf(answer.charAt(i))));
        }
        return answerNum;
    }
}
