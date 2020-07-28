package by.epamtc.information_handling.bean;

public class SentenceComponent implements Component {

    private String word;
    private final static ComponentType COMPONENT_TYPE = ComponentType.SENTENCECOMPONENT;

    public SentenceComponent() {
    }

    public SentenceComponent(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getComponentNumber() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ComponentType getComponentType() {
        return COMPONENT_TYPE;
    }

    @Override
    public String getStringView() {
        return word;
    }
}
