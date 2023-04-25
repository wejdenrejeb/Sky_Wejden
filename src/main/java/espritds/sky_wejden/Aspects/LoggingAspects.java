package espritds.sky_wejden.Aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspects {

    @Before("execution(public * tn.esprit.ds.ski_wejden.services.*.get* (..))")
    //public * tn.esprit.ds.ski_wejden.services.*.get* (..))"
    //JoinPoint : methode illegible : a travers ca on peut recuperer le nom
    public void inMethod(JoinPoint jp)
    {
        log.info("in method"+jp.getSignature().getName());

    }

    @AfterReturning("execution(public * tn.esprit.ds.ski_wejden.services.*.get* (..))")
    //public * tn.esprit.ds.ski_wejden.services.*.get* (..))"
    //JoinPoint : methode illegible : a travers ca on peut recuperer le nom
    public void outMethod(JoinPoint jp)
    {
        log.info("out method"+jp.getSignature().getName());

    }

    @AfterThrowing("execution(public * tn.esprit.ds.sky_wejden.services.*.* (..))")
    //public * tn.esprit.ds.sky_wejden.services.*.get* (..))"
    //JoinPoint : methode illegible : a travers ca on peut recuperer le nom
    public void out_Method(JoinPoint jp)
    {
        log.info("out method"+jp.getSignature().getName());

    }



}
