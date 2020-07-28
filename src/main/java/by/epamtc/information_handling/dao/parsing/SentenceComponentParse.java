package by.epamtc.information_handling.dao.parsing;

import by.epamtc.information_handling.bean.Component;
import by.epamtc.information_handling.bean.SentenceComponent;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceComponentParse implements DataParse {
    private static SentenceComponentParse instance;
    private final String wordRegEx = "(\\w+|\\W)";
    private Pattern pattern = Pattern.compile(wordRegEx);

    public static SentenceComponentParse getInstance() {
        if (instance == null) {
            instance = new SentenceComponentParse();
        }
        return instance;
    }

    @Override
    public void parse(String input, Component sentenceObject) {
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            if (matcher.group() != null) {
                sentenceObject.add(new SentenceComponent(matcher.group().trim()));
            }
        }
    }
}
