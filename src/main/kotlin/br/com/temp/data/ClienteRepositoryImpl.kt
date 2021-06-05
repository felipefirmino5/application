package br.com.temp.data

import br.com.temp.model.Client
import br.com.temp.model.Endereco
import java.lang.RuntimeException

import javax.inject.Singleton
import javax.persistence.EntityManager
import javax.transaction.Transactional


@Singleton
open class ClienteRepositoryImpl(val entityManager: EntityManager) : ClientRepository {


    override fun buscarPeloId(id: Long): Client? {
        return entityManager.find(Client::class.java, id)
    }

    @Transactional
    override fun salvar(name: Client): Client {
        entityManager.persist(name)
        return name
    }

    @Transactional
    override  fun deletarPeloId(id: Long) {
        val genre = buscarPeloId(id)
        if (genre != null) entityManager.remove(genre)
    }

    @Transactional
    override fun buscarTodos(): List<Client> {
        var qlString = "SELECT g FROM Client as g"
        val query = entityManager.createQuery(qlString, Client::class.java)
        return query.resultList
    }

    @Transactional
    override fun salvarEndereco(endereco: Endereco) :Endereco{
        entityManager.persist(endereco)
        return endereco;
    }


}