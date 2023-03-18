package baseball;

import baseball.view.GameResultView;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.List;

public class Game {
    private InputView inputView = new InputView();
    private OutputView outputView = new OutputView();
    private RandomNumGenerator randomNumGenerator = new RandomNumGenerator();
    private StringToListConvertor stringToListConvertor = new StringToListConvertor();
    private GameResultView gameResultView = new GameResultView();
    private GameResult game= new GameResult();

    /** 전체 게임 실행 **/
    public void  runGame(){
        outputView.printGameStart();
        while(true){
            List<Integer> randomNum = setRandom(); //게임 시작할 때마다 새로운 랜덤 3자리 값
            runOneGame(randomNum); //만들어진 3자리 수로 한 게임 시작!
            if (doNotWantRestart()) break; //한 게임이 끝났으면 다시 시작할지 물어보고, 원하지 않으면 종료
        }
    }

    /** 재시작 판단 함수 **/
    private boolean doNotWantRestart() {
        outputView.printRestartOrNot();
        if (inputView.GetRestartNum().equals("2")){
            return true;
        }
        return false;
    }

    /** 하나의 랜덤 3자리 숫자에 대한 게임 실행 **/
    private void runOneGame(List<Integer> randomNum) {
        while(true){
            List<Integer> userNum = setUserAnswer(); //한 게임이 종료될 때까지 user Input 은 계속 받아야 한다.
            if (isGameSuccess(randomNum, userNum)) break;
        }
    }

    /** 해당 useNum 과 randomNum 으로 게임이 성공하는지 판단하는 함수 **/
    private boolean isGameSuccess(List<Integer> randomNum, List<Integer> userNum) {
        List<Integer> result=game.getStrikeAndBall(randomNum, userNum);
        gameResultView.printGameResult(result);

        int strike = result.get(0); //한 게임 성공을 판단하기 위해 strike 갯수만 따로 저장
        if(strike==3){ //성공
            gameResultView.printSuccess();
            return true;
        }
        return false; //실패
    }

    /** User 의 입력값 세팅 함수 **/
    private List<Integer> setUserAnswer() {
        game.clearStrikeAndBall();
        outputView.MessageToAnswer();
        String userInput = inputView.GetAnswerNum();
        List<Integer> userNum = stringToListConvertor.convert(userInput);
        return userNum;
    }

    /** 한 게임을 실행하기 위해 필요한 랜덤 변수 세팅 함수 **/
    private List<Integer> setRandom() {
        randomNumGenerator.clearRandomNum();
        List<Integer> randomNum = randomNumGenerator.makeRandomNum();
        return randomNum;
    }
}
