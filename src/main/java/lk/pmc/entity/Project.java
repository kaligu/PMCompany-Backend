/*
  @ Author       : C.Kaligu Jayanath
  @ Prjoect Name : PMCompany-Backend
  @ Date         : 9/20/2023
  @ Time         : 11:50 PM
*/
package lk.pmc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author : H.C.Kaligu Jayanath
 * Date    : 9/20/2023
 * Time    : 11:50 PM
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString

@Entity
@Table(name = "project")
public class Project implements SuperEntity{
    @Id
    @Column(name = "project_id")
    private Long projectId;

    @Column(name = "project_name")
    private String projectName;

    @ManyToOne
    @JoinColumn(name = "tech_lead_id")
    private TechLead techLead;
}
