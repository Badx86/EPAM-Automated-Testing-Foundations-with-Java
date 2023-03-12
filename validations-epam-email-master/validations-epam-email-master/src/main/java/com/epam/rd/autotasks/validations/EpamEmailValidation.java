package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EpamEmailValidation {

    public static boolean validateEpamEmail(String email) {
        // Put your code here
        if (email == null){return false;}
        String valid = "^([a-z]+_[a-z1-9]+)@(epam\\.com)$";
        Pattern pattern = Pattern.compile(valid);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}





