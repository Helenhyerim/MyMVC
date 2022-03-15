package common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexController extends AbstractController {
// 부모클래스에서 해야할 메소드를 강제로 여기서 재정의 해야한다.
	
	
	@Override
	public String toString() { // toString() 은 원래 Object 에 있는 건데 모든 클래스는 Object 를 부모클래스로 두므로 여기서 재정의 가능하다.
		return "== 확인용 IndexController 클래스의 인스턴스 메소드인 toString() 호출함 == ";
	}
	
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		// 이거는 약속일뿐
		/*
			super.setRedirect(false);
			this.setRedirect(false);
			setRedirect(false);
			다 같은말
		*/
		// serRedirect 값이 default 로 false 이고, false 는 forward 한다는 뜻이니까
		super.setViewPage("/WEB-INF/index.jsp");
		
	}
	

}
