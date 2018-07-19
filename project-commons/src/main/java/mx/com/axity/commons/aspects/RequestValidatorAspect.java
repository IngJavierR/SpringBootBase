package mx.com.axity.commons.aspects;

import jdk.jshell.spi.ExecutionControl;
import mx.com.axity.commons.exceptions.BusinessException;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;

@Aspect
@Configuration
public class RequestValidatorAspect {

    final static private Logger log = Logger.getLogger(RequestValidatorAspect.class);

    @Around(value = "execution(* mx.com.axity.web.rest.*.*(..))  && args(..)")
    public ResponseEntity execute(ProceedingJoinPoint joinPoint) {
        ResponseEntity result;
        try {
            log.info("Access");
            log.info(String.format("Execution: %s", joinPoint.getSignature()));
            result = (ResponseEntity) joinPoint.proceed();
            return result;
        }catch (Throwable e) {
            log.info("Exception Ocurred");
            log.info(String.format("Execution: %s", joinPoint.getSignature()));
            log.info(String.format("Exception: %s", e.getMessage()));
            throw new BusinessException("Error", e);
        }
    }
}
