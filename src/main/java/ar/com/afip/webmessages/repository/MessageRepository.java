package ar.com.afip.webmessages.repository;

import ar.com.afip.webmessages.model.Message;

import java.util.List;
import java.util.Set;

public interface MessageRepository extends Repository<Message>{
    List<Message> FindByRecipient(int recipient);
    List<Message> FindAll();
    void saveMessage(Message message);
}
