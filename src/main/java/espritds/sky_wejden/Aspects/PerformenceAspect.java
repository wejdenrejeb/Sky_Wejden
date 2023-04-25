package espritds.sky_wejden.Aspects;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
@Slf4j
public class PerformenceAspect {
    @Around("execution(public * tn.esprit.ds.sky_wejden.services.*.add* (..))")
    public Object ExecutionTime(ProceedingJoinPoint pjp) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Object o = pjp.proceed();

        stopWatch.stop();
        log.info("execution time of{} is {}",pjp.getSignature().getName() , stopWatch.getTotalTimeMillis() );

        return o;


        //ye7Sebli temps de reponse mte3 kol methode tetlansa
    }
}

