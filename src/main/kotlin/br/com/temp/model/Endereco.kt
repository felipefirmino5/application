package br.com.temp.model

import javax.persistence.*


@Entity
@SequenceGenerator(name = "sq_endereco", allocationSize=1, )
class Endereco {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_endereco")
    var id = 0;
    @Column(name = "logradouro")
    var logradouro = ""
    @Column(name = "cidade")
    var cidade=""
}