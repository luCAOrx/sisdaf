package br.gov.rn.pm.sisdaf.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_ocorrencias")
public class Ocorrencia extends AuditedEntity {

    @Id
    @Column(name = "oco_ic")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "oco_quantidade")
    private Long quantidade;

    @Column(name = "oco_data")
    private String data;

    @Column(name = "oco_hora")
    private String hora;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "oco_opm_id")
    private Opm opm;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "oco_pol_id")
    private Policial policial;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "oco_arm_id")
    private Arma arma;

}
