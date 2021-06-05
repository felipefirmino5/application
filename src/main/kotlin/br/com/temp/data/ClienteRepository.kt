package br.com.temp.data

import br.com.temp.model.Client
import br.com.temp.model.Endereco


interface ClientRepository {
     fun buscarPeloId(id: Long): Client?
     fun salvar( name: Client): Client
     fun deletarPeloId(id: Long)
     fun buscarTodos(): List<Client>
     fun salvarEndereco(endereco: Endereco): Endereco


}