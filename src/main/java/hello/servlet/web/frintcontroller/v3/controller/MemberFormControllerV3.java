package hello.servlet.web.frintcontroller.v3.controller;

import hello.servlet.web.frintcontroller.ModelView;
import hello.servlet.web.frintcontroller.v3.ControllerV3;
import org.springframework.ui.Model;

import java.util.Map;

public class MemberFormControllerV3 implements ControllerV3 {
    @Override
    public ModelView process(Map<String, String> paramMap) {
        return new ModelView("new-form");
    }
}
