package co.comp.boot;

import java.security.Principal;

import javax.servlet.http.HttpSession;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
@MapperScan(basePackages = "co.comp.**.mapper")
public class BootsecApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootsecApplication.class, args);
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}

	
	@GetMapping("/top")
	public String top() {
		return "top";
	}
	
	@GetMapping("/user/user")
	public String user(@AuthenticationPrincipal Principal uservo, 
			HttpSession session) {
		String sessionLoginId = (String)session.getAttribute("loginId");
		System.out.println(sessionLoginId);
		
		UserDetails userDetails = 
				(UserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		System.out.println(userDetails.getUsername());
		
		//System.out.println(uservo.getName());//userid
		return "user/user";
	}
	
	@GetMapping("/admin/admin")
	public void admin() {
	}

}
