package com.rennangalvao.personapi.entity;


import com.rennangalvao.personapi.enums.PhoneType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity // Indica que a classe e uma entidade
@Data  // Inserir Getter & setter
@Builder  // Padrão de projeto
@AllArgsConstructor  // Inserir os construtores
@NoArgsConstructor
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)  // Define de acordo com o enums
    @Column(nullable = false)  //Not null
    private PhoneType type;

    @Column(nullable = false) //Not null
    private String number;
}
