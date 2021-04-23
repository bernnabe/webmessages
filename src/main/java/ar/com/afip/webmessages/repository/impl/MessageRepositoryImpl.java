package ar.com.afip.webmessages.repository.impl;

import ar.com.afip.webmessages.model.Message;
import ar.com.afip.webmessages.repository.MessageRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MessageRepositoryImpl implements MessageRepository {

    //TODO pasar a un key-value store donde la key es recipient y el set<message> son los mensajes ordenados para ese key
    private Map<Integer, Queue<Message>> store;

    public MessageRepositoryImpl() {
        initRepository();
    }

    @Override
    public Message find(String arg) {
        return null;
    }

    @Override
    public List<Message> FindByRecipient(int recipient) {
        List<Message> messages = new ArrayList<>();

        //Si no hay mensajes devuelvo una lista vacía
        if (!this.store.containsKey(recipient)) {
            return new ArrayList<>();
        }

        Queue<Message> messageQueue = this.store.get(recipient);
        return (List<Message>) messageQueue;
    }

    @Override
    public List<Message> FindAll() {
        List<Message> messages = new ArrayList<>();
        Collection<Queue<Message>> messagesQueues = store.values();

        for (Queue<Message> queue : messagesQueues) {
            messages.addAll(queue);
        }

        return messages;
    }

    @Override
    public void saveMessage(Message message) {
        if (!this.store.containsKey(message.getRecipient()))
            this.store.put(message.getRecipient(), new LinkedList<>());

        this.store.get(message.getRecipient()).add(message);
    }

    private void initRepository() {
        this.store = new HashMap<>();
    }
}
