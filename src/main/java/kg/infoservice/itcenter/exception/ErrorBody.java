package kg.infoservice.itcenter.exception;

import lombok.Data;

@Data
public class ErrorBody {

    public ErrorBody(String message) {
        this.message = message;
    }

    private String message;
}
