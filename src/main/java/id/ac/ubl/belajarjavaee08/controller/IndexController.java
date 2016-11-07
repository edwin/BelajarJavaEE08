package id.ac.ubl.belajarjavaee08.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <pre>
 *  id.ac.ubl.belajarjavaee08.controller.IndexController 
 * </pre>
 *
 * @author edwin < edwinkun at gmail dot com >
 * Nov 7, 2016 5:05:29 PM
 *
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/testing", method = RequestMethod.GET)
    public String testing() {
        return "testing";
    }
    
}
