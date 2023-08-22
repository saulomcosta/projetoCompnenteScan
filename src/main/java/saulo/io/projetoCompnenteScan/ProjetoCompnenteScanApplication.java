package saulo.io.projetoCompnenteScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import saulo.io.projetoCompnenteScan.controller.MyController;

@SpringBootApplication
@ComponentScan(basePackages = { "saulo.io.projetoComponentScan.services", "saulo.io.projetoCompnenteScan.controller" })
public class ProjetoCompnenteScanApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ProjetoCompnenteScanApplication.class, args);

		MyController myController = (MyController) applicationContext.getBean("myController");
		myController.hello();
	}

}
