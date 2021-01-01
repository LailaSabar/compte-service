package org.sid.compte.feign;

import org.sid.compte.model.Abonne;
import org.sid.compte.model.Demande;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="DEMANDE-SERVICE")
public interface DemandeRestClient {
	
	@GetMapping(path="/demandes/{id}")
	Abonne getDemandeById(@PathVariable(name="id") Long id);
	
    @GetMapping("/demandes")
    PagedModel<Demande> findAll();

}
