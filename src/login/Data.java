package login;

public class Data {

    private static final String CHECK_CHARACTERS = "abcdefghijklmnopqrstuvwxyzABSDIFGHIJKLMNOPQRSTUVWXYZ1234567890_";


    private Data() {

    }

    public static boolean checkInput(String login, String password, String confirmPassword) {
        try {
            checkData(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;


    }

    private static void checkData(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if(!checkLogPass(login)){
            throw new WrongLoginException("Логин не соответствует требованиям");
        }
        if(!checkLogPass(login)){
            throw new WrongPasswordException("Пароль не соответствует требованиям");
        }
        if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }

    private static boolean checkLogPass(String string) {
        if(string.length() > 20) {
            return  false;
        }
        for (int i = 0; i < string.length() ; i++) {
            if(!CHECK_CHARACTERS.contains(String.valueOf(string.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}
