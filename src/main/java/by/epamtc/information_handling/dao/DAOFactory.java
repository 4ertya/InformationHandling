package by.epamtc.information_handling.dao;

import by.epamtc.information_handling.dao.impl.TxtTextDAOImpl;

public class DAOFactory {

    private static final DAOFactory instance = new DAOFactory();

    private final TextDAO txtTextDAO = new TxtTextDAOImpl();

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return instance;
    }

    public TextDAO getTxtTextDAO() {
        return txtTextDAO;
    }
}
