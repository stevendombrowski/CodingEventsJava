package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {

}


// public class MyRepository implements EventRepository() gets created automatically from SpringBoot that connects it
//to the @Autowired eventRepository in Event class