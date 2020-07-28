package by.epamtc.information_handling.bean;

import java.util.ArrayList;
import java.util.List;

public class Sentence implements Component {

    private List<Component> words = new ArrayList<>();
    private String sentence;
    private final static ComponentType COMPONENT_TYPE = ComponentType.SENTENCE;
    private int componentNumber;

    public Sentence() {
    }

    public Sentence(String sentence, int componentNumber) {
        this.sentence = sentence;
        this.componentNumber = componentNumber;
    }

    public String getSentence() {
        return sentence;
    }

    public List<Component> getWords() {
        return words;
    }

    public Component getWord(int index) {
        return words.get(index);
    }

    public int getWordsSize() {
        return words.size();
    }

    @Override
    public void add(Component component) {
        words.add(component);
    }

    @Override
    public void remove(Component component) {
        words.remove(component);
    }

    @Override
    public int getComponentNumber() {
        return componentNumber;
    }

    @Override
    public ComponentType getComponentType() {
        return COMPONENT_TYPE;
    }

    @Override
    public String getStringView() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Component word : words) {
            stringBuilder.append(word.getStringView()).append(" ");
        }
        return stringBuilder.toString();
    }
}
