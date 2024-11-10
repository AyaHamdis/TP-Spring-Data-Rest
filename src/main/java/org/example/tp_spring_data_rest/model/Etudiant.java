package org.example.tp_spring_data_rest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.tp_spring_data_rest.enums.Genre;

@Entity
@Data  @NoArgsConstructor @AllArgsConstructor @Builder
@Table(name="etudiants")
public class Etudiant {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nom_etudiant", nullable = false)
    private String nom;
    @Column(name = "prenom_etudiant", nullable = false)
    private String prenom;
    @Enumerated(EnumType.STRING)
    private Genre genre;
}
