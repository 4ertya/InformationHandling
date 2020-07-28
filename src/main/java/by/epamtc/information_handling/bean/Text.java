package by.epamtc.information_handling.bean;


import java.util.*;

public class Text implements Component {
    private List<Sentence> sentences = new ArrayList<>();
    private List<CodeBlock> codeBlocks = new ArrayList<>();
    private final static ComponentType COMPONENT_TYPE = ComponentType.TEXT;
    private static int componentNumber;

    public Text() {
        componentNumber = 0;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public Sentence getSentence(int index) {
        return this.sentences.get(index);
    }

    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    public void addSentence(Sentence sentence) {
        this.sentences.add(sentence);
    }

    public List<CodeBlock> getCodeBlocks() {
        return codeBlocks;
    }

    public CodeBlock getCodeBlock(int index) {
        return codeBlocks.get(index);
    }

    public void setCodeBlocks(List<CodeBlock> codeBlocks) {
        this.codeBlocks = codeBlocks;
    }

    public void addCodeBlock(CodeBlock codeBlock) {
        codeBlocks.add(codeBlock);
    }

    public int getComponentNumber() {
        return componentNumber;
    }

    public void increaseComponentNumber() {
        componentNumber++;
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public ComponentType getComponentType() {
        return null;
    }

    @Override
    public String getStringView() {
        List<Component> components = new ArrayList<>();
        components.addAll(sentences);
        components.addAll(codeBlocks);

        components.sort(Comparator.comparing(Component::getComponentNumber));

        StringBuilder result = new StringBuilder();
        for (Component component : components) {
            result.append(component.getStringView()).append(" ");
        }
        return result.toString();
    }
}
