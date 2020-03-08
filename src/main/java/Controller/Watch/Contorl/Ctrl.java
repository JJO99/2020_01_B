package Controller.Watch.Contorl;

import Controller.Watch.Service.search;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//이부분은 어찌 해결을 봐야될지 모르겠어서 준호의 것을 참고함..

@Controller
public class Ctrl {
    private search search;

    @Autowired
    // Search 객체가 존재하는지를 확인한 후에 그 객체를 변수에 주입한다.
    public void setSearch(search search) {
        this.search = search;
    }

    // URL 패턴을 매핑하여 해당 메소드를 실행한다.
    // URL이 localhost:8080/search 일 때 아래 test 메소드 수행
    @RequestMapping(value = "/index2", method = RequestMethod.GET)
    public String test() {
        search.sequ_search();
        search.bina_search();
        return "index2";
    }
}
