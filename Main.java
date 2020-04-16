public class Main {
    private static Telephone telephone;
    private static final String[] validEmail = new String[]{"(84)-(0971998732)", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String args[]) {
        telephone = new Telephone();
        for (String sdt : validEmail) {
            boolean isvalid = telephone.validate(sdt);
            System.out.println("Email is " + sdt + " is valid: " + isvalid);
        }
        for (String sdt : invalidEmail) {
            boolean isvalid = telephone.validate(sdt);
            System.out.println("Email is " + sdt + " is valid: " + isvalid);

        }
    }
}
