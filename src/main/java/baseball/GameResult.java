package baseball;

import java.util.List;

import static java.util.Arrays.asList;

public class GameResult {
    private int strike=0;
    private int ball=0;
    public List<Integer> getStrikeAndBall(List<Integer> answer, List<Integer> userNum){
        for(int i=0;i<3;i++){
            compareSinglyDigit(answer, userNum, i);
        }
        return asList(strike, ball); //스트라이크 수와 볼 수 반환
    }

    private void compareSinglyDigit(List<Integer> answer, List<Integer> userNum, int i) {
        //한자리씩 비교 -> strike, ball 개수 계산
        if(answer.contains(userNum.get(i))){
            if(userNum.get(i)== answer.get(i)){
                strike+=1;
            }else{
                ball+=1;
            }
        }
    }
    public void clearStrikeAndBall(){
        strike=0;
        ball=0;
    }
}
