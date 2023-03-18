package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String GetAnswerNum(){
        String answer = Console.readLine();

        checkIsThreeDigit(answer);
        checkIsNumber(answer);
        checkNotDuplication(answer);

        return answer;
    }

    public String GetRestartNum(){
        String choice = Console.readLine();

        checkIsOneOrTwo(choice);

        return choice;
    }

    private void checkIsThreeDigit(String userInput){
        if (userInput.length()!=3){
            throw new RuntimeException();
        }
    }

    private void checkIsNumber(String userInput){
        try{
            int number=Integer.parseInt(userInput);
        }catch (Exception e){
            throw new RuntimeException();
        }
    }

    //숫자 3자리라는 건 확인 완료 됐고, 중복만 확인하면 됨
    private void checkNotDuplication(String userInput){

    }

    //단순하게 string이 1인지 2인지 비교
    private void checkIsOneOrTwo(String userInput){

    }

}
