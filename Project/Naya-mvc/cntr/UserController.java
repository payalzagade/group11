package cntr;

import java.util.List;

import javax.jws.soap.SOAPBinding.Use;
import javax.servlet.http.HttpServletRequest;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


import dao.UserDao;
import dto.User;

@Controller
public class UserController {
@Autowired
	private UserDao userDao;
	
	@RequestMapping(value="/reg_form.htm")
	public String reg(ModelMap model) {
		model.put("user", new User());
		return "reg_form";
	}
	
	@RequestMapping(value="/reg3.htm")
	public String reg1(ModelMap model) {
		model.put("user", new User());
		return "reg";
	}
	
	@RequestMapping(value="/reg.htm")
	public String create(User user) {
		userDao.createUser(user);
		return "index";
	}
	
	@RequestMapping(value="/login.htm")
		public String login(ModelMap model)
		{
			model.put("user", new User());
			return "login";
		}
		
	
	
	@RequestMapping(value="/login1.htm")
	public String login(User user,ModelMap model)
	{
		List<User>list=userDao.login(user);
		
		if(list.isEmpty())
		{
			model.put("user", new User());
			return "login";
		}
		else
		{
			model.put("role", list.get(0).getUserRole());
			if(list.get(0).getUserRole().equals("admin"))
				return "admin";
			
			else {
				if(list.get(0).getUserRole().equals("operator"))
					return "operator";
			}
			
		}
		return "index";
	}
	
	@RequestMapping(value="/user_list.htm")
	public String userlist(User user,ModelMap model)
	{
		List<User>list=userDao.selectusers();
		model.put("ulist", list);
		return "user_list";
	}
	
	@RequestMapping(value="/delete_user.htm")
	public String delete(HttpServletRequest request,ModelMap model) {
		
		String u=request.getParameter("userId");
		int id=Integer.parseInt(u);
		
		User ud= new User(id);
		userDao.deleteuser(ud);
		List<User>list=userDao.selectusers();
		model.put("ulist", list);
		return "user_list";
	}
	
	
	@RequestMapping(value="/select_user.htm")
	public String select(HttpServletRequest request,ModelMap model)
	{
		String u=request.getParameter("userId");
		int id= Integer.parseInt(u);
	
	User u2=	userDao.selectuser(id);
	
		model.put("user",u2 );
	return 	"update_form";
	}
	
	@RequestMapping(value="update_user.htm")
	public String update(User user,ModelMap model)
	{
		userDao.updateuser(user);
		List<User>list=userDao.selectusers();
		model.put("ulist", list);
		return "user_list";
		
	}
	
	
}
