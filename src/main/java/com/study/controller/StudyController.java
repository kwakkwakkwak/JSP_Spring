package com.study.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.common.util.CommonUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class StudyController {

		@RequestMapping("/study/showMessage.html")
		public String showMessage(Model model, HttpServletRequest req, HttpServletResponse res) {

			model.addAttribute("message","hello! Spring");
			model.addAttribute("combo", CommonUtil.getSelect());
			return "showMessage"; //view 이름이다. 어떤 view를 보여줄지 이름을 정해줌.
		}		

	
}
