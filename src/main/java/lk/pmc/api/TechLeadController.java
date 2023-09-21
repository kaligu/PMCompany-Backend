/*
  @ Author       : C.Kaligu Jayanath
  @ Prjoect Name : PMCompany-Backend
  @ Date         : 9/20/2023
  @ Time         : 11:47 PM
*/
package lk.pmc.api;

import lk.pmc.dto.TechLeadDTO;
import lk.pmc.service.custom.TechLeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author : H.C.Kaligu Jayanath
 * Date    : 9/20/2023
 * Time    : 11:47 PM
 */

@RestController
@RequestMapping("/techlead")
@CrossOrigin
public class TechLeadController {

    @Autowired
    TechLeadService techLeadService;

    @PostMapping(path = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    boolean saveTechLead(@RequestBody TechLeadDTO techLeadDTO) {
        System.out.println("Requested a new TechLead: " + techLeadDTO.getTechLeadName());
        return techLeadService.saveTechLead(techLeadDTO);
    }
}
