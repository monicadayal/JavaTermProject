/**
 * 
 */
package com.project.GroupF.Dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.project.GroupF.Beans.AccountBean;

/**
 * Date 3/29/2022
 * @author Sophiya Maharjan
 *
 */
public class AccountDao {
	
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		 this.template = template; 
	}
	
	public int registerAccount(AccountBean acc) {
		String query = "";
		return template.update(query);
	
	}
	
	public AccountBean getAccountById(int id) {
		System.out.println("client "+id);
		String data = "select * from accounts where account_id =?";
		return template.queryForObject(data, new Object[] {id}, new BeanPropertyRowMapper<AccountBean>(AccountBean.class));
	}
	

}
