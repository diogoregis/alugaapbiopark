package br.com.biopark.alugaap.controller;


import br.com.biopark.alugaap.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {

    @Autowired
    private DashboardService dashboard;
    @Autowired
    private EdificioService edificioService;

    @Autowired
    private AluguelService aluguelService;
    @Autowired
    private LocatarioService locatarioService;

    @Autowired
    private ApartamentoService apartamentoService;

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("dash", dashboard.valorTotalDeContratosAtivosAll());
        return "index";
    }

    @RequestMapping("/edificios/")
    public String edificios(Model model){
        model.addAttribute("edificios", edificioService.findAll());
        return "edificios";
    }

    @RequestMapping("/locatario/")
    public String locatarios(Model model){
        model.addAttribute("locatarios", locatarioService.findAll());
        return "locatario";
    }

    @RequestMapping("/aluguel/")
    public String alugueis(Model model){
        model.addAttribute("alugueis", aluguelService.findAll());
        return "aluguel";
    }

    @RequestMapping("/disponivel/")
    public String disponivel(Model model){
        model.addAttribute("disponiveis", apartamentoService.findAll());
        return "disponivel";
    }

}
