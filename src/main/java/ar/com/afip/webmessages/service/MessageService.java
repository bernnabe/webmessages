package ar.com.afip.webmessages.service;

import ar.com.afip.webmessages.model.Message;

import java.util.List;
import java.util.Set;

public interface MessageService {
    void Save(Message message) throws Exception;
    List<Message> FindAll();
    List<Message> FindByRecipient(int recipient);
}
