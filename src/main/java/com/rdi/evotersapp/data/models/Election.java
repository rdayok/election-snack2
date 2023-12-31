package com.rdi.evotersapp.data.models;

import com.rdi.evotersapp.enums.TypeOfElection;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ELECTION")
public class Election {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Enumerated(EnumType.STRING)
    private TypeOfElection election;
    @ManyToMany
    @JoinColumn(name = "partyId")
    private List<Party> registeredParties;
    private Boolean isActive;
    @CreatedDate
    private LocalDateTime electionDate;
}
