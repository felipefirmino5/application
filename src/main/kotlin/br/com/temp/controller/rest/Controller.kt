package br.com.temp.controller.rest

import br.com.temp.data.ClientRepository
import br.com.temp.model.Client
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post

@Controller("/cliente")
class Controller(protected val clientData: ClientRepository) {

    @Get(produces = [MediaType.APPLICATION_JSON])
    fun  list():List<Client> {
        return clientData.buscarTodos();
    }

    @Post
    fun  criar( c: Client):Client{
        c.id = 0;
        c.endereco =  clientData.salvarEndereco(c.endereco);
        clientData.salvar(c)
        return c;
    }


}