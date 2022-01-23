package com.rennangalvao.personapi.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.rennangalvao.personapi.enums.PhoneType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity // Indica que a classe e uma entidade
@Data  // Inserir Getter & setter
@Builder  // Padrão de projeto
@AllArgsConstructor  // Inserir os construtores
@NoArgsConstructor
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)   // Define de acordo com o enums
    @Column(nullable = false) //Not null
    private PhoneType type;

    @Column(nullable = false)   //Not null
    private String number;

}
