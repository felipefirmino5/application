package br.com.temp.model

import javax.persistence.*


@Entity
@SequenceGenerator(name = "sq_cliente", allocationSize=1, )
class Client {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_cliente")
    var id = 0;
    @Column(name = "name")
    var name = ""
    @Column(name = "document")
    var document=""

    @OneToOne
    @JoinColumn(name="cdEnderecoPrincipal")
    lateinit var endereco: Endereco;

}