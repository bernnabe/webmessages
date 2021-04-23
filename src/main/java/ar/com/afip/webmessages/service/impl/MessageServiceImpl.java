package ar.com.afip.webmessages.service.impl;

import ar.com.afip.webmessages.model.Message;
import ar.com.afip.webmessages.repository.MessageRepository;
import ar.com.afip.webmessages.service.MessageService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

@Service
public class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;
    private Random idGenerator;

    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
        this.idGenerator = new Random();
    }

    public List<Message> FindByRecipient(int recipient) {
        return this.messageRepository.FindByRecipient(recipient);
    }

    @Override
    public void Save(Message message) throws Exception {
        if (message.getSender() <= 0) throw new Exception("Sender must be greater then zero");
        if (message.getRecipient() <= 0) throw new Exception("Recipient must be greater then zero");
        if ("".equals(message.getContent())) throw new Exception("Message can not be empty");

        message.setId(this.idGenerator.nextInt());
        message.setCreate(LocalDateTime.now());

        this.messageRepository.saveMessage(message);
    }

    @Override
    public List<Message> FindAll() {
        return this.messageRepository.FindAll();
    }
}
