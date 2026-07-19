package java8.combinationpattern;

import java.time.LocalDate;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //HashMap
        Customer customer = new Customer(
          "Alice",
          "alice@gmail.com",
                "0787878",
                LocalDate.of(2000, 1, 1)
        );
        boolean res = CustomerValidatorService.isValid(customer);
        //System.out.println(res);
        Java8customervalidator.ValidationResult resp = Java8customervalidator.isEmailValid()
                .or(Java8customervalidator.isPhoneNumberValid())
                .or(Java8customervalidator.isAdult())
                .apply(customer);
        if(!resp.equals(Java8customervalidator.ValidationResult.SUCCESS)){
            throw new IllegalStateException("validation failed" + resp.name());
        }
    }
}
