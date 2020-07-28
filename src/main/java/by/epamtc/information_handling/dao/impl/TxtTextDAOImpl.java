package by.epamtc.information_handling.dao.impl;

import by.epamtc.information_handling.dao.TextDAO;
import by.epamtc.information_handling.dao.parsing.BlockParse;
import by.epamtc.information_handling.dao.reader.DocumentReader;
import by.epamtc.information_handling.bean.Text;

public class TxtTextDAOImpl implements TextDAO {
    @Override
    public Text getTextObject() {
        Text text = new Text();
        DocumentReader documentReader = new DocumentReader();

        String input = documentReader.readInfo();
        BlockParse.getInstance().parse(input, text);

        return text;
    }
}
