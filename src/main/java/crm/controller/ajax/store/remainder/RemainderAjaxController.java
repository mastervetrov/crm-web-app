package crm.controller.ajax.store.remainder;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crm/web-app/ajax/store/remainder")
@Slf4j
public class RemainderAjaxController {
    @GetMapping("")
    private String loadStoreRemainder(Model model) {
        return "crm/web-app/store/remainder :: div.store-remainder-panel";
    }
}
