package com.university.University_Management_System.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Entity
public class EventModel {

   @Id
   private int eventId;



   private String eventName;
   private String locationOfEvent;
   private LocalDate date;
   private LocalTime startTime;
   private LocalTime endTime;

   public int getEventId() {
      return eventId;
   }

   public void setEventId(int eventId) {
      this.eventId = eventId;
   }

   public String getEventName() {
      return eventName;
   }

   public void setEventName(String eventName) {
      this.eventName = eventName;
   }

   public String getLocationOfEvent() {
      return locationOfEvent;
   }

   public void setLocationOfEvent(String locationOfEvent) {
      this.locationOfEvent = locationOfEvent;
   }

   public LocalDate getDate() {
      return date;
   }

   public void setDate(LocalDate date) {
      this.date = date;
   }

   public LocalTime getStartTime() {
      return startTime;
   }

   public void setStartTime(LocalTime startTime) {
      this.startTime = startTime;
   }

   public LocalTime getEndTime() {
      return endTime;
   }

   public void setEndTime(LocalTime endTime) {
      this.endTime = endTime;
   }

   public EventModel(int eventId, String eventName, String locationOfEvent, LocalDate date, LocalTime startTime, LocalTime endTime) {
      this.eventId = eventId;
      this.eventName = eventName;
      this.locationOfEvent = locationOfEvent;
      this.date = date;
      this.startTime = startTime;
      this.endTime = endTime;
   }

   public EventModel() {
   }
}
