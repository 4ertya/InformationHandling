package by.epamtc.information_handling.service.impl;

import by.epamtc.information_handling.bean.Component;
import by.epamtc.information_handling.bean.Sentence;
import by.epamtc.information_handling.bean.SentenceComponent;
import by.epamtc.information_handling.bean.Text;
import by.epamtc.information_handling.service.TextService;

import java.util.Comparator;
import java.util.List;

public class TextServiceImpl implements TextService {

    @Override
    public void printSentencesForTheNumberOfWords(Text text) {
        List<Sentence> sentences = text.getSentences();
        sentences.sort(Comparator.comparing(Sentence::getWordsSize));
        for (Sentence sentence : sentences) {
            System.out.println(sentence.getStringView());
        }
    }

    @Override
    public void replaceWordsWithSubstring(Text text, int sentenceIndex, int wordsLength, String substring) {
        Sentence sentence = text.getSentence(sentenceIndex);
        List<Component> sentenceComponents = sentence.getWords();
        for (int i = 0; i < sentenceComponents.size(); i++) {
            if (sentenceComponents.get(i).getStringView().length() == wordsLength) {
                sentenceComponents.set(i, new SentenceComponent(substring));
            }
        }
        System.out.println(sentence.getStringView());
    }

    @Override
    public void replaceFirstWithLastInSentences(Text text) {
        List<Sentence> sentences = text.getSentences();
        for (Sentence sentence : sentences) {
            List<Component> words = sentence.getWords();
            Component temp = words.get(0);
            words.set(0, words.get(words.size() - 1));
            words.remove(words.size() - 1);
            words.add(temp);
            System.out.println(sentence.getStringView());
        }

    }
}
