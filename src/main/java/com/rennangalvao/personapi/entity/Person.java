package com.rennangalvao.personapi.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity  //Entidade
@Data   // Inserir Getter & setter
@Builder  // Padrão de projeto
@AllArgsConstructor  // Inserir os construtores
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) // Not null
    private String firstName;

    @Column(nullable = false) //Not null
    private String lastName;

    @Column(nullable = false, unique = true) //Not null  / unique = Ùnico
    private String cpf;


    private LocalDate brithDate;

    // Relacionamento, Chamar somente uma operação para os Phones
    @OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Phone> phones;
}
