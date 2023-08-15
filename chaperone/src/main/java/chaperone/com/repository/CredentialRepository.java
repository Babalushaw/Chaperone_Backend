package chaperone.com.repository;

import chaperone.com.model.Credential;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CredentialRepository extends JpaRepository<Credential,Long> {
}
