/*
  @ Author       : C.Kaligu Jayanath
  @ Prjoect Name : PMCompany-Backend
  @ Date         : 9/20/2023
  @ Time         : 11:59 PM
*/
package lk.pmc.repository;

import lk.pmc.entity.TechLead;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : H.C.Kaligu Jayanath
 * Date    : 9/20/2023
 * Time    : 11:59 PM
 */
public interface TechLeadRepository extends JpaRepository<TechLead, String> {
}
