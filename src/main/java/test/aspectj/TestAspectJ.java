package test.aspectj;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TestAspectJ {

    @Before("execution(* main(..))")
    public void doBefore() {
        System.out.println("TestAspectJ.doBefore");
    }

    @After("execution(* main(..))")
    public void doA() {
        System.out.println("TestAspectJ.AFTER");
    }


//    @Around("mainMethod()")
 /*   public Object doAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Invoked Method= " + getMethodName(proceedingJoinPoint));
        Object[] args = proceedingJoinPoint.getArgs();
        System.out.println("TestAspectJ.doAround Antes. interceptados parametros: " + args);
        Object arg = args[0];
        Object retVal = null;
        try {
            retVal = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            System.out.println("throwable intercepted with message: " + throwable.getMessage());
            throwable.printStackTrace();
//            throwable.printStackTrace();
        }
        System.out.println("TestAspectJ.doAround Despues. interceptada salida: " + retVal);
        return retVal;
    }

    private String getMethodName(ProceedingJoinPoint proceedingJoinPoint) {
        MethodSignature signature = (MethodSignature) proceedingJoinPoint.getSignature();
        String name = signature.getMethod().getName();
        return name;
    }*/


}
