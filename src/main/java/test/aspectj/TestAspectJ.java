package test.aspectj;

//@Aspect
public class TestAspectJ {

//    @Pointcut("execution(* TestService.main(..))")
//    @Pointcut("execution(* main(..) && args(String))")
    public void mainMethod(String parameter) {
//        Nunca se ejecuta
        System.out.println();
    }

//    @After("mainMethod()")
    public void doAfter() {
        System.out.println("TestAspectJ.doAfter");
    }

//    @Before("mainMethod()")
    public void doBefore() {
        System.out.println("TestAspectJ.doBefore");
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
