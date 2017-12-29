package pl.coderslab.warsztat6.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.coderslab.warsztat6.bean.SessionManager;
import pl.coderslab.warsztat6.entity.Message;
import pl.coderslab.warsztat6.entity.User;
import pl.coderslab.warsztat6.repository.MessageRepository;

@Controller
@RequestMapping("/message")
public class MessageController {

	@Autowired
	private MessageRepository messageRepository;
	
	@GetMapping("")
	public String messageList(Model m) {
		m.addAttribute("message", new Message());
		return "message_list";
	}
	
	@ModelAttribute("userMessages")
	public List<Message> getMessages() {
		HttpSession s = SessionManager.session();
		User u = (User) s.getAttribute("user");
		return this.messageRepository.findByRecieverOrderByCreatedDesc(u);
	}
	
	@ModelAttribute("sentMessages")
	public List<Message> getSentMessages() {
		HttpSession s = SessionManager.session();
		User u = (User) s.getAttribute("user");
		return this.messageRepository.findBySenderOrderByCreatedDesc(u);
	}
}
