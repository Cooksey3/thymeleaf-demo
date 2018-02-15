package org.wecancodeit.thymeleafdemo;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IterableController {

	@RequestMapping("/show_iterable")
	public String showIterable(Model model) {
		model.addAttribute("myIterable", Arrays.asList(new Person("Ford", "Prefect"), new Person("Arthur", "Dent")));
		return "iterable";
	}
}
