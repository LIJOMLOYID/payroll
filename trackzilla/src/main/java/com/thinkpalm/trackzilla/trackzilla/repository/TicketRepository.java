package com.thinkpalm.trackzilla.trackzilla.repository;

import com.thinkpalm.trackzilla.trackzilla.entity.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
