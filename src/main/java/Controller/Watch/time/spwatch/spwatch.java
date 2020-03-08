package Controller.Watch.time.spwatch;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

//stopwatch reference: https://java.ihoney.pe.kr/506
//aspect, component...: 스프링 퀵 스타트
//pointcut: 스프링 퀵 스타트(p.205)

@Aspect
@Component
public class spwatch {
    @Pointcut("execution(* Controller.Watch.service..*Impl.*(..))")
    public void allPointcut(){}

    @Around("allPointcut()")

    public Object check(ProceedingJoinPoint joinPoint) throws Throwable {
        StopWatch sw = new StopWatch();
        sw.start();

        Object finish = joinPoint.proceed();

        sw.stop();
        System.out.println(sw.getTotalTimeMillis()+"(ms)초"+sw.prettyPrint());
        return finish;

    }



}
