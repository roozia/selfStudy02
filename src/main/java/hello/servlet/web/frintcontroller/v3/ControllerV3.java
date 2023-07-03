package hello.servlet.web.frintcontroller.v3;

import hello.servlet.web.frintcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {
    ModelView process(Map<String, String> paramMap);
}
