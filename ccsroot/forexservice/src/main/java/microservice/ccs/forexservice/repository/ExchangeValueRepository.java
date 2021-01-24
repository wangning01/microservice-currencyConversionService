package microservice.ccs.forexservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import microservice.ccs.forexservice.domain.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

	public ExchangeValue findByFromAndTo(String from, String to);
}
