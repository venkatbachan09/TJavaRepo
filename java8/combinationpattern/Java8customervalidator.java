package java8.combinationpattern;
import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;
//enum is by defualt static
import static java8.combinationpattern.Java8customervalidator.*;
import static java8.combinationpattern.Java8customervalidator.ValidationResult.*;


public interface Java8customervalidator extends Function<Customer, ValidationResult>{

     static Java8customervalidator isEmailValid(){
        return customer -> customer.getEmail().contains("@") ? SUCCESS : EMAIL_NOT_VALID;
    }
     static Java8customervalidator isPhoneNumberValid(){
        return customer -> customer.getPhonumber().startsWith("+0") ? SUCCESS : PHONE_NOT_VALID;
    }
     static Java8customervalidator isAdult(){
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 16 ? SUCCESS: IS_NOT_AN_ADULT;
    }
    default Java8customervalidator or (Java8customervalidator other){
         return customer -> {
             return this.apply(customer).equals(SUCCESS) ? other.apply(customer) : this.apply(customer);
         };
    }
    enum ValidationResult{
        SUCCESS,
        PHONE_NOT_VALID,
        EMAIL_NOT_VALID,
        IS_NOT_AN_ADULT
    }
}
