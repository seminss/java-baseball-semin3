package baseball.view;

import java.util.List;

public class OutputView {
    public void printGameStart() {
        System.out.print(ConstantView.START.getMessage());
    }

    public void printRestartOrNot() {
        System.out.print(ConstantView.RESTART.getMessage());
    }

    public void MessageToAnswer() {
        System.out.print(ConstantView.GET.getMessage());
    }
}
