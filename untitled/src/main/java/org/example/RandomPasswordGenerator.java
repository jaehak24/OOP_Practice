package org.example;

import org.passay.CharacterData;
import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;

public class RandomPasswordGenerator {
    PasswordGenerator gen=new PasswordGenerator();

    public static final String ALLOWED_SPL_CHARACTERS="!@#$%^&*()_+";

    public String GeneratePassword(){
        PasswordGenerator gen=new PasswordGenerator();

        CharacterData lowercaseChars= EnglishCharacterData.LowerCase;
        CharacterRule lowercaseRule=new CharacterRule(lowercaseChars);
        lowercaseRule.getNumberOfCharacters();

        CharacterData upperCaseChars=EnglishCharacterData.UpperCase;
        CharacterRule upperCaseRule=new CharacterRule(upperCaseChars);
        upperCaseRule.getNumberOfCharacters();

        CharacterData di

    }


}
