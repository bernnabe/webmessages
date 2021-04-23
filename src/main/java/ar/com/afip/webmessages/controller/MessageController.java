package ar.com.afip.webmessages.controller;

import ar.com.afip.webmessages.model.Message;
import ar.com.afip.webmessages.service.MessageService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@ResponseBody
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping(value = {"/message/{recipient}"}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<Message>> getMessages(@PathVariable int recipient) {
        List<Message> messages = this.messageService.FindByRecipient(recipient);

        return ResponseEntity.ok(messages);
    }

    @GetMapping(value = {"/message"}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<Message>> getAllMessages() {
        List<Message> messages = this.messageService.FindAll();

        return ResponseEntity.ok(messages);
    }


    @PostMapping(value = "/message", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity postBody(@RequestBody Message message) throws Exception {
        this.messageService.Save(message);

        return ResponseEntity
                .created(URI.create(String.format("/message/%s", message.getRecipient())))
                .body(message);
    }
}