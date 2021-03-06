/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcc.MIIUniversity.repositories;

import com.mcc.MIIUniversity.entities.Fakultas;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Laila
 */

@Repository
public interface FakultasRepository extends JpaRepository<Fakultas, String>{
   
//since we dont need search, so lets just comment it
//    @Query("SELECT f FROM Fakultas f WHERE f.name like %?1%")
//    public List<Fakultas> search(String keyword);
// 
//}
    
}
