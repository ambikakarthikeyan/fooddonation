package com.mscomm.ngoservice.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mscomm.ngoservice.entity.*;
public interface NgoRepository extends JpaRepository<Ngo, Long>{

	  List<Ngo> findByNgoName(String ngoName);

}
