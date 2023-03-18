package baseball.view;

public enum ConstantView {
    SUCCESS("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n"),
    START("숫자 야구 게임을 시작합니다.\n"),
    RESTART("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.\n"),
    GET("숫자를 입력해주세요 : ");

    private String message;
    public String getMessage(){
        return message;
    }
    ConstantView(String message) {
        this.message=message;
    }
}
