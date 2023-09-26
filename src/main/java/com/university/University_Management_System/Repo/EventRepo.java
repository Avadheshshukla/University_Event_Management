package com.university.University_Management_System.Repo;

import com.university.University_Management_System.Model.EventModel;
import jdk.jfr.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface EventRepo extends JpaRepository<EventModel, Integer> {

    List<EventModel> findByDate(LocalDate date);


}
