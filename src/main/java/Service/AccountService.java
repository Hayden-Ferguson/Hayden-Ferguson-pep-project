package Service;

import Model.Account;
import DAO.AccountDAO;

import java.util.List;

/**
 * The purpose of a Service class is to contain "business logic" that sits between the web layer (controller) and
 * persistence layer (DAO). That means that the Service class performs tasks that aren't done through the web or
 * SQL: programming tasks like checking that the input is valid, conducting additional security checks, or saving the
 * actions undertaken by the API to a logging file.
 *
 * It's perfectly normal to have Service methods that only contain a single line that calls a DAO method. An
 * application that follows best practices will often have unnecessary code, but this makes the code more
 * readable and maintainable in the long run!
 */
public class AccountService {
    private AccountDAO accountDAO;
    /**
     * no-args constructor for creating a new AuthorService with a new AuthorDAO.
     * There is no need to change this constructor.
     */
    public AccountService(){
        accountDAO = new AccountDAO();
    }
    /**
     * Constructor for a AuthorService when a AuthorDAO is provided.
     * This is used for when a mock AuthorDAO that exhibits mock behavior is used in the test cases.
     * This would allow the testing of AuthorService independently of AuthorDAO.
     * There is no need to modify this constructor.
     * @param authorDAO
     */
    public AccountService(AccountDAO accountDAO){
        this.accountDAO = accountDAO;
    }
    /**
     * TODO: Use the AuthorDAO to retrieve all authors.
     *
     * @return all authors
     */
    public List<Account> getAllAccounts() {
        return accountDAO.getAllAccounts();
    }
    /**
     *
     * @param account an account object.
     * @return The persisted account if the insertion is successful.
     */
    public Account addAccount(Account account) {
        return accountDAO.insertAccount(account);
    }


    /**
     * Checks if a account exists with the given username and password
     *
     * @param account an account object.
     * @return returns account if it exists, otherwise return null
     */
    public Account checkLogin(Account account) {
        return accountDAO.checkLogin(account);
    }


    /**
     * Checks if a account exists with the given username
     *
     * @param account an account object.
     * @return returns account if it exists, otherwise return null
     */
    public Boolean checkId(int id) {
        return accountDAO.checkId(id);
    }
}
