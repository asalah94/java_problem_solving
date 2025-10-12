package learning.FunctionProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PhoneNumberValidator {

    public static void main(String[] args) {
        List<String> phoneNumbers = Arrays.asList("01001894226", "0111001587");
        Predicate<String> isValidNumbers = phone->phone.startsWith("0100")&&phone.length()==11;
        List<String> validNumbers = phoneNumbers.stream().filter(isValidNumbers).collect(Collectors.toList());
        System.out.println(validNumbers);
}}
