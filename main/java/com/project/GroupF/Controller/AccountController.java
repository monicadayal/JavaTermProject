/**
 * 
 */
package com.project.GroupF.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.GroupF.Beans.AccountBean;
import com.project.GroupF.Dao.AccountDao;

/**
 * Date: 3/29/2022
 * @author Sophiya Maharjan C0795243
 * 
 *
 */
@Controller
public class AccountController {
	
	@Autowired
	AccountDao dao; // will inject dao from xml file

	@RequestMapping("/clientDashboard")
	public String showform(Model m) {
		m.addAttribute("command", new AccountBean());
		return "ClientDashboard";
	}
	
	@RequestMapping(value="/clientDashboard/{id}")
	public String viewAccountUser(@PathVariable int id, Model m) {
		AccountBean acc = dao.getAccountById(id);
		m.addAttribute("acc", acc);
		System.out.println("client "+acc.getAccount_number());
		return "ClientDashboard";
	}
}
