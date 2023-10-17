package hanghackaton.horanedu.common.exception;

import lombok.Getter;

@Getter
public class GlobalException extends RuntimeException{
    private final ExceptionEnum error;

    public GlobalException(ExceptionEnum e) {
        super(e.getMessage());
        this.error = e;
    }

}
