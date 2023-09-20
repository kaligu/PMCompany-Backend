package lk.pmc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "employee")
public class Employee implements SuperEntity{
    @Id
    private String empID;
    @Column(nullable = false)
    private String empName;
    @Column(nullable = false)
    private String empEmail;
    @Column(nullable = false)
    private String empDep;
    @Lob
    @Column(nullable = false,columnDefinition = "Text")
    private String empProfile;
}
