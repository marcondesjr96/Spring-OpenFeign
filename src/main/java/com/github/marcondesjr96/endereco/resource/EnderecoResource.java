package com.github.marcondesjr96.endereco.resource;

import com.github.marcondesjr96.endereco.response.EnderecoResponse;
import com.github.marcondesjr96.endereco.service.ViaCepService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cep")
@RequiredArgsConstructor
public class EnderecoResource {

    private final ViaCepService viaCepService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{cep}")
    public EnderecoResponse obterCep(@PathVariable("cep") String cep){
        return viaCepService.obterCep(cep);

    }
}
