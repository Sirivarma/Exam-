package com.example.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.bean.ApplicationBean;
import com.example.bean.JobsBean;
import com.example.bean.Register;
import com.example.bean.User;
import com.example.exception.RecruitmentManagementException;
import com.example.service.ApplicationBeanService;
import com.example.service.JobsBeanService;
import com.example.service.RegisterService;

@Controller
public class ExamController {
	public static java.util.Date utilDate = new java.util.Date();
	public static java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
	public static int count = 0;
	@Autowired
	ApplicationBeanService applicationservice;
	@Autowired
	RegisterService registerService;

	@Autowired
	JobsBeanService jobsBeanService;
	/*	@Autowired
	ApplicationStatusService appStatusService;*/

	@RequestMapping(value= {"/","/sample"})
	public String getHome() throws Exception {
		
		if (count == 0) {
			Register reg = new Register("Admin",sqlDate,"B.Tech","Admin1@gmail.com","Admin123","7382796062","Male","Admin");
			/*reg.setUserType("Admin");
			reg.setPassword("Admin");
			reg.setCandidateName("Admin");*/
			Register register = registerService.AddRegister(reg);
			System.err.println(register);
			count++; //throw new RecruitmentManagementException(1,"Normal Exception");
		}
		return "index";
	}

	@RequestMapping("/Register")
	public String candidateRegister(Model model) {
		model.addAttribute("register", new Register());
		return "register";
	}

	@RequestMapping("/registering")
	public String registering(@Valid @ModelAttribute("register") Register reg, BindingResult br, Model model) {
		Register register = null;
		if (br.hasErrors()) {
			return "register";
		}
		model.addAttribute("name", reg.getCandidateName());
		try {
			System.out.println(reg.getCandidateName());
			register = registerService.AddRegister(reg);

		} catch (Exception e) {
			// e.getMessage();
			return "error";
		}
		model.addAttribute("userId", register.getCandidateId() + "is your user Id");
		model.addAttribute("userid", register.getCandidateId());
		List<JobsBean> jobList=jobsBeanService.retriveAll();/*
		model.addAttribute("name", reg.getCandidateName());
		model.addAttribute("userid", Integer.toString(reg.getCandidateId()));*/
		model.addAttribute("joblist",jobList);
		return "logging";
	}

	@RequestMapping("/Login")
	public String getLoginPage(Model model) {
		model.addAttribute("user", new User());
		return "login";

	}

	@RequestMapping("/logging")
	public String logginging(@Valid @ModelAttribute("user") User user,BindingResult br , Model model) {
		if(br.hasErrors()) {
			return "login";
		}
		// model.addAttribute("name", reg.getCandidateName());
		try {
			Register reg = registerService.retiveOne(Integer.parseInt(user.getUsername()));

			if (reg.getPassword().equals(user.getPassword())) {
				if ("Admin".equals(reg.getUserType())) {
					return "adminLogging";
				} else {
					System.err.println("chiru");
					List<JobsBean> jobList=jobsBeanService.retriveAll();
					model.addAttribute("name", reg.getCandidateName());
					model.addAttribute("userid", Integer.toString(reg.getCandidateId()));
					model.addAttribute("joblist",jobList);
					return "logging";
				}
			} else {
				model.addAttribute("msg1", "please Enter correct password");
				return "login";
			}
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		//	throw new RecruitmentManagementException(1,"Exception Raised");
			model.addAttribute("msg", "invalid username");
			return "login";
		}
		// return "logging";
	}

	public static List<String> getList() {
		List<String> aList = (List<String>) new ArrayList<String>();
		aList.add("");
		aList.add("Hindhu");
		aList.add("christain");
		aList.add("Muslim");
		return aList;
	}

	@RequestMapping("/Apply")
	public String getApplication(Model model, @RequestParam("id") String id) {
		model.addAttribute("application", new ApplicationBean());
		model.addAttribute("list", getList());
		// String userId=Integer.toString(id);
		model.addAttribute("userId", id);
		return "apply";
	}

	@RequestMapping(value = "/applying")
	public String addApplicant(Model model,@Valid @ModelAttribute("application") ApplicationBean applicationBean,BindingResult br )
	{ Register reg = null;
		if(br.hasErrors() ) {
		model.addAttribute("list", getList());
		// String userId=Integer.toString(id);
		model.addAttribute("userId", applicationBean.getUserId());
		return"apply";
	}
		else {

			List<JobsBean> jobList=jobsBeanService.retriveAll();
		try {
			applicationBean.setModifiedDate(sqlDate);
			applicationBean.setStatus("None");
			applicationBean.setComments("No Comments");
			ApplicationBean appbean = applicationservice.addApplication(applicationBean);
			int id = Integer.parseInt(applicationBean.getUserId());
			reg = registerService.retiveOne(id);
			System.err.println("chiranjeevi");
			model.addAttribute("name", reg.getCandidateName());
			model.addAttribute("userid", reg.getCandidateId());
			model.addAttribute("msg", "chiru" + appbean.getApplicationId() + " is your application id.");/*
			model.addAttribute("name", reg.getCandidateName());
			model.addAttribute("userid", Integer.toString(reg.getCandidateId()));*/
			model.addAttribute("joblist",jobList);
			return "logging";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//	e.printStackTrace();
			int id = Integer.parseInt(applicationBean.getUserId());
			try {
				//reg = registerService.retiveOne(id);
				model.addAttribute("name", reg.getCandidateName());
				model.addAttribute("userid", reg.getCandidateId());
				model.addAttribute("joblist",jobList);
				return "logging";
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
						
				model.addAttribute("name", reg.getCandidateName());
				model.addAttribute("userid", reg.getCandidateId());
				model.addAttribute("joblist",jobList);
				return "logging";
			}
		}

		}// return "applysuccess";

	}

	@RequestMapping("/viewapplied")
	public String getApplications(Model model)  {
		List<ApplicationBean> applications = applicationservice.retriveAll();
		List<ApplicationBean> appValid=new ArrayList<ApplicationBean>();
		for(ApplicationBean app : applications) {
			if("None".equals(app.getStatus()))
				appValid.add(app);
		}
		if (applications.size() <= 0||appValid.size()<=0)
		/* if(applications.isEmpty()) */ {
			model.addAttribute("msg", "No records to display.");
			model.addAttribute("user", new User());
			model.addAttribute("pass", "Admin123");
			model.addAttribute("userid",1);
			return "error";
		}
		/*Register reg;
		try {
			reg = registerService.retiveOne(1);*/
		
		model.addAttribute("applications", appValid);
		model.addAttribute("user", new User());
		model.addAttribute("pass", "Admin123");
		model.addAttribute("userid", 1);
		return "applications";
		/*} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			model.addAttribute("user", new User());
			model.addAttribute("pass", "Admin");
			model.addAttribute("userid",1);
			return "error";
		}*/
	}

	@RequestMapping("/viewProfile")
	public String viewProfile(Model model, @RequestParam("id") int id) {
		try {
			Register register = registerService.retiveOne(id);
			model.addAttribute("profile", register);
			model.addAttribute("user", new User());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			model.addAttribute("msg", "some technical problems");
			return "error";
		}
		return "viewProfile";
	}

	@SuppressWarnings("null")
	@RequestMapping("/viewApplications")
	public String applied(Model model,@RequestParam("id") String id){

		Register reg=null;
		try {
			reg = registerService.retiveOne(Integer.parseInt(id));
			List<ApplicationBean> applications=applicationservice.retriveAll();
			List<ApplicationBean> appList=new ArrayList<ApplicationBean>();
			for(ApplicationBean app:applications) 
			{
				if(app.getUserId().equals(id))
					appList.add(app);
			}	
			if(applications.size()<=0||appList.size()<=0)
				/*if(applications.isEmpty())*/ 
			{

				model.addAttribute("msg", "No records to display.");
				model.addAttribute("user", new User());
				model.addAttribute("pass", reg.getPassword());
				model.addAttribute("userid", reg.getCandidateId());
				return "error";
			}
			else 
			{
				
					model.addAttribute("applications", appList);
					model.addAttribute("user", new User());
					model.addAttribute("pass", reg.getPassword());
					model.addAttribute("userid", reg.getCandidateId());
					return "applicationsuser";

			} 
		}catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();

			model.addAttribute("user", new User());
			model.addAttribute("pass", reg.getPassword());
			model.addAttribute("userid", reg.getCandidateId());
			return "error";
		}
	}
	@RequestMapping("/addnew")
	public String addNewJob(Model model){
		model.addAttribute("add", new JobsBean());
		model.addAttribute("user", new User());
		model.addAttribute("pass", "Admin123");
		model.addAttribute("userid",1);
		return "addnew";
	}
	@RequestMapping("/adding")
	public String addNew(@Valid @ModelAttribute("add") JobsBean job, BindingResult br,Model model) {
		if(br.hasErrors()) {
			model.addAttribute("user", new User());
			model.addAttribute("pass", "Admin123");
			model.addAttribute("userid",1);
			return "addnew";
		}
		JobsBean jobs=jobsBeanService.addNew(job);
		model.addAttribute("msg", jobs.getJobId()+"  is Job Id");
		return "adminLogging";
	}
	@RequestMapping("/accept")
	public String acceptRequest(Model model,@RequestParam("id") int id) {
		//ApplicationStatus app=appStatusService.changeStatus("Accepted", id, app);
		model.addAttribute("msg","Accepted");
		model.addAttribute("appId",id);
		return "changeStatus";
	}
	@RequestMapping("/reject")
	public String rejectRequest(Model model,@RequestParam("id") int id) {
		model.addAttribute("msg","Accepted");
		model.addAttribute("appId",id);
		return"changeStatus";
	}
	@RequestMapping("/change")
	public String changeStatus(Model model,@RequestParam("appid") int appId,@RequestParam("Comments") String comments,@RequestParam("status") String status) {
		
			//	System.err.println(appId+" chiru"+comments+ "ram"+status);
			int app=applicationservice.updateApplication(status, comments, appId,sqlDate);
			System.out.println(app);
			System.err.println(applicationservice.retriveAll());;
			model.addAttribute("msg", "application number with"+appId+" is "+status);
			model.addAttribute("user", new User());
			model.addAttribute("pass", "Admin123");
			model.addAttribute("userid", 1);
			return "error";

	}
	@RequestMapping("/error1")
	public String errorPage(Model model, @RequestParam("type") int type,@RequestParam("status") String status) {
		model.addAttribute("type", type);
		model.addAttribute("status", status);
		return "error1";
	}
}
