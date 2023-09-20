/*
  @ Author       : C.Kaligu Jayanath
  @ Prjoect Name : PMCompany-Backend
  @ Date         : 9/21/2023
  @ Time         : 12:00 AM
*/
package lk.pmc.repository;

import lk.pmc.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : H.C.Kaligu Jayanath
 * Date    : 9/21/2023
 * Time    : 12:00 AM
 */
public interface ProjectRepository extends JpaRepository<Project, String> {
}
