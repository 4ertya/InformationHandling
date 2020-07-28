package by.epamtc.information_handling.bean;

public class CodeBlock implements Component {

    private String codeBlock;
    private final static ComponentType COMPONENT_TYPE = ComponentType.CODEBLOCK;
    private int componentNumber;

    public CodeBlock() {
    }

    public CodeBlock(String codeBlock, int componentNumber) {
        this.codeBlock = codeBlock;
        this.componentNumber = componentNumber;
    }

    public String getCodeBlock() {
        return codeBlock;
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
        return componentNumber;
    }

    @Override
    public ComponentType getComponentType() {
        return COMPONENT_TYPE;
    }

    @Override
    public String getStringView() {
        return codeBlock;
    }
}
