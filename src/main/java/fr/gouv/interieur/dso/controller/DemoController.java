package fr.gouv.interieur.dso.controller;

import fr.gouv.interieur.dso.models.Demo;
import fr.gouv.interieur.dso.service.jdbc.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.gouv.interieur.dso.service.dto.ResponseDto;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@RestController
@RequestMapping("/api/demo")
@Tag(name = "Demo", description = "Endpoints de démonstration")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @Operation(summary = "Message de bienvenue", description = "Retourne un message hello world")
    @GetMapping("/")
    public ResponseDto helloWorld() {
        ResponseDto responseDto = new ResponseDto();
        responseDto.setMessage("hello world !");
        responseDto.setStatus("ok");
        return responseDto;
    }

    @Operation(summary = "Liste des demos", description = "Retourne la liste des entités Demo")
    @GetMapping("/demo")
    public ResponseEntity<List<Demo>> getDemosList(){
        return new ResponseEntity<>(demoService.getListDemo(), HttpStatus.OK);
    }
}
