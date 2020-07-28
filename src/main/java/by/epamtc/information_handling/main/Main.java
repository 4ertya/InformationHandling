package by.epamtc.information_handling.main;

import by.epamtc.information_handling.dao.DAOFactory;
import by.epamtc.information_handling.bean.Text;
import by.epamtc.information_handling.service.TextService;
import by.epamtc.information_handling.service.impl.TextServiceImpl;

public class Main {
    public static void main(String[] args) {
        DAOFactory daoFactory = DAOFactory.getInstance();
        Text text = daoFactory.getTxtTextDAO().getTextObject();
        TextService textService = new TextServiceImpl();

        System.out.println("весь текст");
        System.out.println(text.getStringView());

//        System.out.println("предложения по возрастанию количества слов");
//        textService.printSentencesForTheNumberOfWords(text);
//
//        System.out.println("заменяет слова заданной длины в предложении подстрокой");
//        textService.replaceWordsWithSubstring(text, 3, 4, "AAA");
//
//        System.out.println("меняет местами первое и последнее слово");
//        textService.replaceFirstWithLastInSentences(text);

    }
}
