package kg.infoservice.itcenter.exception;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    private final Log logger = LogFactory.getLog(getClass());

    @ExceptionHandler(value = MyResourceNotFoundException.class)
    public ResponseEntity<?> exception(MyResourceNotFoundException exception){
        logger.error("Запись о данном учителе не найдена");
        return new ResponseEntity<>(new ErrorBody("Запись о данном учителе не найдена"), HttpStatus.NOT_FOUND);
    }

   /* public ResponseEntity<?> exception(MyResourceNotFoundException teacherAlreadyExists){
        return new ResponseEntity<>(new ErrorBody("Запись уже создана"), HttpStatus.CONFLICT);
    }*/
}
