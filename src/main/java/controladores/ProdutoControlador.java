package controladores;

import modelos.Produto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProdutoControlador {
    
    
    public ModelAndView obterProduto(){
        ModelAndView mav;
        mav = new ModelAndView("listar-produtos");
        Produto p;
        p = new Produto();
        p.setId(1L);
        p.setNome("iPhone");
        p.setPreco(9999.99f);
        p.setQuantidade(1);
        mav.addObject("produto",p);
        
        return mav;
    }
    
}
