package PrimeraAPI_JuanCarlos.DEV_JuanCarlos.Controller;

import PrimeraAPI_JuanCarlos.DEV_JuanCarlos.Models.DTO.DTOUsuario;
import PrimeraAPI_JuanCarlos.DEV_JuanCarlos.Models.Repository.InterfaceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/apiUsers")
public class Usuarios{

    @Autowired
    private InterfaceUsuario acceso;

    @GetMapping("/getUsers")
    public List<DTOUsuario> dataUsers(){

        return acceso.obtenerDatos();
    }
}
