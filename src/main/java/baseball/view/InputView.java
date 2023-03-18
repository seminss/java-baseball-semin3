package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String GetAnswerNum(){
        String answer = Console.readLine();

        checkIsThreeDigit(answer);
        checkIsNumber(answer);
        checkDuplication(answer);

        return answer;
    }

    public String GetRestartNum(){
        String choice = Console.readLine();

        checkIsOneOrTwo(choice);

        return choice;
    }

    private void checkIsThreeDigit(String userInput){
        if (userInput.length()!=3){
            throw new IllegalArgumentException();
        }
    }

    private void checkIsNumber(String userInput){
        try{
            Integer.parseInt(userInput);
        }catch (Exception e){
            throw new IllegalArgumentException();
        }
    }

    private void checkDuplication(String userInput){
        int fstNum=(int)(userInput.charAt(0));
        int scdNum=(int)(userInput.charAt(1));
        int thdNum=(int)(userInput.charAt(2));
        if(fstNum==scdNum || fstNum==thdNum || scdNum==thdNum ){
            throw new IllegalArgumentException();
        }
    }

    private void checkIsOneOrTwo(String userInput){
        if(!userInput.equals("1") && !userInput.equals("2")){
            throw new IllegalArgumentException();
        }
    }

}
