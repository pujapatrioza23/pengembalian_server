/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.puja.peminjaman.service.repository;

import com.puja.peminjaman.service.entity.Peminjaman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ACER
 */
@Repository
public interface PeminjamanRepository extends JpaRepository<Peminjaman, Long> {

    public Peminjaman findByPeminjamanId(Long peminjamanId);

}
