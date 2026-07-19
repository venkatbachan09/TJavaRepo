package java8.combinationpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {
    private static boolean isEmailValid(String email){
        return email.contains("@");
    }
    private static boolean isPhoneNumberValid(String phonenumber){
        return phonenumber.startsWith("+0");
    }
    private static boolean isAdult(LocalDate dob){
        return Period.between(dob, LocalDate.now()).getYears() > 16;

    }
    public static boolean isValid(Customer customer){
        return isEmailValid(customer.getEmail())
                && isPhoneNumberValid(customer.getPhonumber())
                && isAdult(customer.getDob());
    }
}
