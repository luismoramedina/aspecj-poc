package test.aspectj;


public class TestService {

    public TestService() {
    }

    public String main(String parameter) throws Exception {
        System.out.println("TestService.main, parameter: " + parameter);
        return "salida";
    }

    public void forzeException() throws Exception {
        String[] strings = new String[]{"uno"};
        String string = strings[22];

    }

}
