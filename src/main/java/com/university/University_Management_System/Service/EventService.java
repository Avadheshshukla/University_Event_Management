package com.university.University_Management_System.Service;

import com.university.University_Management_System.Model.EventModel;
import com.university.University_Management_System.Model.StudentModel;
import com.university.University_Management_System.Repo.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@Service
public class EventService {

    @Autowired
    EventRepo eventRepo;

    public  List<EventModel> getAllEvents(LocalDate date) {
        return  eventRepo.findByDate(date);
    }

    public String addEvent(List<EventModel> events) {
        eventRepo.saveAll(events);
        return "Events added !! ";
    }


    public String removeEvent(List<Integer> id) {
        eventRepo.deleteAllById(id);
        return  "Event deleted !";
    }

    public String updateEvent(Integer id, String myEvent) {
        EventModel event=eventRepo.findById(id).orElse(null);
        if(event != null){
            event.setEventName(myEvent);
            eventRepo.save(event);
            return "event updated !";
        }
        return "No event found !";
    }

    public Optional<EventModel> getEventById(Integer id) {
        return eventRepo.findById(id);
    }
}
