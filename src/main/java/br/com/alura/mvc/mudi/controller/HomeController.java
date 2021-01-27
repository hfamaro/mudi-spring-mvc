package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		
		Pedido p1 = new Pedido();
		
		p1.setNomeProduto("Headset Gamer HyperX Cloud Stinger Core PS4/Xbox One/Nintendo Switch");
		p1.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/614CUyeVxUL._AC_SL1500_.jpg");
		p1.setUrlProduto("https://www.amazon.com.br/Headset-HyperX-Stinger-Nintendo-Switch/dp/B07BB3PYD8/?_encoding=UTF8&pd_rd_w=63vsk&pf_rd_p=d510337a-570c-40ee-9125-b51bd083f7fb&pf_rd_r=XRF9R9SEQEF4NG89G1S4&pd_rd_r=dfbbc7d6-49a5-43b9-b899-22da0123db27&pd_rd_wg=e2kMR&ref_=pd_gw_crs_zg_bs_7791985011");
		p1.setDescricao("Sobre este item "+
				"Compatível com vários consoles"+
				"Apresenta controles de áudio no fio "+
				"Um controle ajustável de aço no arco da cabeça e fones de ouvido macios "+
				"O microfone flexível e giratório te permite posicionar o microfone onde quiser "+
				"Conforto e qualidade de som "+
				"Cabo compatível com 1 entrada fone+microfone. Caso seu computador tenha duas entradas separadas, será necessário um adaptador vendido separadamente.");
		
		List<Pedido> pedidos = Arrays.asList(p1,p1,p1);
		
		model.addAttribute("pedidos", pedidos);
		
		System.out.println("Pronto para exibir");
		
		return "home";
	}
}
