class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

class ExceptionHandling5 {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18+");
        }
        System.out.println("Eligible");
    }

    public static void main(String[] args) throws Exception {
        checkAge(16);
    }
}
