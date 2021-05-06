package com.devsuperior.dsvendas.services;

import com.devsuperior.dsvendas.dtos.SaleDTO;
import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.repositories.SaleRepository;
import com.devsuperior.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {
    @Autowired
    private SaleRepository repo;

    @Autowired
    private SellerRepository sallerRepo;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable page){
        //Para fazer cache e não buscar vendedor a vendedor na hora do Find All, não indicado para muitas linhas
        sallerRepo.findAll();
        Page<Sale> sales = repo.findAll(page);

        return sales.map( x -> new SaleDTO(x));
    }
}
