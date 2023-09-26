package com.university.University_Management_System.Controller;

import com.university.University_Management_System.Model.EventModel;
import com.university.University_Management_System.Model.StudentModel;
import com.university.University_Management_System.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class EventController {

    @Autowired
    EventService eventService;


    @PostMapping("/addEvents")
    public String addEvent(@RequestBody List<EventModel> events) {
        return eventService.addEvent(events);
    }


//    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @GetMapping("/allEvents/date")
    public List<EventModel> getAllEvents(@RequestParam LocalDate date) {
        return eventService.getAllEvents(date);
    }

    @DeleteMapping("deleteEvent/id/{id}")
    public String removeEvent(@PathVariable List<Integer> id) {
        return eventService.removeEvent(id);
    }

    @PutMapping("update/event/id/{id}")
    public String updateEvent(@PathVariable Integer id, @RequestParam String myEvent) {
        return eventService.updateEvent(id, myEvent);
    }

    @GetMapping("eventById/{id}")
    public Optional<EventModel> getEventById(@PathVariable Integer id){
        return eventService.getEventById(id);
    }

}

