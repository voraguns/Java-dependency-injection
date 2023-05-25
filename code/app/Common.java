package app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class Common {
    
    @RequestMapping("/")
    String m1() {
        return "sample";
    }
    
    @RequestMapping("/staff")
    String m2(Model m) {
        m.addAttribute("location", "Bangkok");
        String[] data = { "David B", "Michael O", "Frank L", "David J" };
        m.addAttribute("staff", data);
        return "test";
    }
}