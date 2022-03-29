/**
 * 
 */
package com.project.GroupF.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.GroupF.Beans.ClientDetailBean;
import com.project.GroupF.Dao.ClientDetailDao;

/**
 * @author Monica
 *
 */
@Controller
public class ClientDetailController {
	@Autowired
	ClientDetailDao dao; // to inject dao from xml file.
	
	/*
	 * It displays a form to input data, here "command" is a reserved request
	 * attribute which is used to display object data into form
	 */
	
	@RequestMapping("/ClientDetail")
	public String showform(Model m) {
		m.addAttribute("command", new ClientDetailBean());
		return "ClentDetailBean";
	}
	
	//@RequestMapping(value="/addClient", method = Requ)
	

	
}
