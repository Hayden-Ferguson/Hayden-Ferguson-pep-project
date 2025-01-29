package Service;

import Model.Message;
import DAO.MessageDAO;

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
public class MessageService {
    private MessageDAO messageDAO;
    /**
     * no-args constructor for creating a new AuthorService with a new AuthorDAO.
     * There is no need to change this constructor.
     */
    public MessageService(){
        messageDAO = new MessageDAO();
    }


    /**
     * Constructor for a AuthorService when a AuthorDAO is provided.
     * This is used for when a mock AuthorDAO that exhibits mock behavior is used in the test cases.
     * This would allow the testing of AuthorService independently of AuthorDAO.
     * There is no need to modify this constructor.
     * @param authorDAO
     */
    public MessageService(MessageDAO MessageDAO){
        this.messageDAO = messageDAO;
    }


    /**
     *
     * @param message a message object.
     * @return The persisted message if the insertion is successful.
     */
    public Message addMessage(Message message) {
        return messageDAO.insertMessage(message);
    }

    
    public List<Message> getAllMessages() {
        return messageDAO.getAllMessages();
    }

    
    public Message getMessageById(int message_id) {
        return messageDAO.getMessageById(message_id);
    }
}
