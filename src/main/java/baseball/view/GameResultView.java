package baseball.view;

import java.util.List;

public class GameResultView {
    public void printGameResult(List<Integer> result){
        //게임 결과 메세지(스트라이크, 볼, 낫싱)
        int strike= result.get(0);
        int ball=result.get(1);

        if(strike==0 && ball==0){
            System.out.println("낫싱");
        } else if (strike==3) {
            System.out.println(strike+"스트라이크");
        } else if (strike==0 &&ball!=0){
            System.out.println(ball+"볼");
        } else if (strike!=0 &&ball==0) {
            System.out.println(strike+"스트라이크");
        } else if (strike!=0 && ball !=0) {
            System.out.println(ball+"볼 "+strike+"스트라이크");
        }
    }
    public void printSuccess(){
        System.out.print(ConstantView.SUCCESS.getMessage());
    }
}
