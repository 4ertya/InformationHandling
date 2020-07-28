package by.epamtc.information_handling.service;


import by.epamtc.information_handling.bean.Text;

public interface TextService {

    void printSentencesForTheNumberOfWords(Text text);

    void replaceWordsWithSubstring(Text text, int sentenceIndex, int wordsLength, String substring);

    void replaceFirstWithLastInSentences(Text text);
}
