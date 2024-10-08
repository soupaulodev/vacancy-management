package br.com.soupaulodev.gestao_vagas.modules.company.repositories;

import br.com.soupaulodev.gestao_vagas.modules.company.entities.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyEntity, UUID> {
    Optional<CompanyEntity> findByUsername(String username);
    
    Optional<CompanyEntity> findByUsernameOrEmail(String username, String email);
}
