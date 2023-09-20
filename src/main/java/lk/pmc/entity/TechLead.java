/*
  @ Author       : C.Kaligu Jayanath
  @ Prjoect Name : PMCompany-Backend
  @ Date         : 9/20/2023
  @ Time         : 11:49 PM
*/
package lk.pmc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

/**
 * @author : H.C.Kaligu Jayanath
 * Date    : 9/20/2023
 * Time    : 11:49 PM
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString

@Entity
@Table(name = "tech_lead")
public class TechLead implements SuperEntity{
    @Id
    @Column(name = "tech_lead_id")
    private Long techLeadId;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "techLead", cascade = CascadeType.ALL)
    private List<Project> projects;
}
