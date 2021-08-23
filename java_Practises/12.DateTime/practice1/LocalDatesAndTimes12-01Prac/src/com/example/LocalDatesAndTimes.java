package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import static java.time.Month.*;  // Months
import static java.time.DayOfWeek.*; // Days of the week
import static java.time.temporal.ChronoUnit.*;  // DAYS, HOURS, etc
import java.time.temporal.TemporalAdjusters;

public class LocalDatesAndTimes {

    public static void main(String[] args) {

        // Abe Lincoln's Birthday: February 12, 1809, died April 15, 1865
        LocalDate abeBorn = LocalDate.of(1809, FEBRUARY, 12);
        LocalDate abeDie = LocalDate.of(1865, APRIL, 15);
        //   How old when he died?
        System.out.println("Abe was " + abeBorn.until(abeDie, YEARS) + " when he died.");
        //   How many days did he live?
        System.out.println("Abe lived for " + abeBorn.until(abeDie, DAYS) + " days.\n");

        // Bennedict Cumberbatch, July 19, 1976
        LocalDate benBorn = LocalDate.of(1976, JULY, 19);
        //   Born in a leap year?
        System.out.println("Bennedict was born in a leap year: " + benBorn.isLeapYear());
        //   How many days in the year he was born?
        System.out.println("Days in the year he was born: " + benBorn.lengthOfYear());
        //   How many decades old is he?
        LocalDate now = LocalDate.now();
        System.out.println("Benedict is " + benBorn.until(now, DECADES) + " decades old.");
        //   What was the day of the week on his 21st birthday?
        System.out.println("It was a " + benBorn.plusYears(21).getDayOfWeek() + " on his 21st birthday\n");

        // Train departs Boston at 1:45PM and arrives New York 7:25PM
        LocalTime depart = LocalTime.of(13, 45);
        LocalTime arrive = LocalTime.of(19, 25);
        //   How many minutes long is the train ride?
        System.out.println("Planned Travel time:  " + depart.until(arrive, MINUTES) + " minutes");
        //   If the train was delayed 1 hour 19 minutes, what is the actual arrival time?
        System.out.println("Delayed arrival time: " + arrive.plusHours(1).plusMinutes(19) + "\n");

        // Flight: Boston to Miami, leaves March 24th 9:15PM. Flight time is 4 hours 15 minutes
        LocalDateTime leaveBoston = LocalDateTime.of(2014, MARCH, 24, 21, 15);
        LocalDateTime arriveMiami = leaveBoston.plusHours(4).plusMinutes(15);
        //   When does it arrive in Miami?
        System.out.println("The flight arrives in Miami: " + arriveMiami);
        //   When does it arrive if the flight is delays 4 hours 27 minutes?
        System.out.println("The delayed arrival time is: " + arriveMiami.plusHours(4).plusMinutes(27) + "\n");

        // School semester starts the second Tuesday of September of this year.
        //   Hint: Look at the TemporalAdjusters class
        int excludeWeeks = 5;
        LocalDate schoolStarts = LocalDate.of(2014, SEPTEMBER, 1).with(TemporalAdjusters.firstInMonth(TUESDAY)).with(TemporalAdjusters.next(TUESDAY));
        LocalDate endOfFirstWeek = schoolStarts.with(TemporalAdjusters.next(FRIDAY));
        long firstWeekDays = schoolStarts.until(endOfFirstWeek, DAYS) + 1;
        //   What is the date?
        System.out.println("School starts: " + schoolStarts);
        //   School summer vacation starts June 25th
        LocalDate schoolEnds = LocalDate.of(2015, JUNE, 25);
        System.out.println("School ends:   " + schoolEnds);
        //   Assuming:
        //     *  Two weeks off in December
        //     *  Two other vacation weeks
        //     *  School is taught Monday - Friday
        //   How many days of school are there?
        long lastWeeksDays = 0;
        if (schoolEnds.getDayOfWeek() != MONDAY) {
            LocalDate lastWeekStart = schoolEnds.with(TemporalAdjusters.previous(MONDAY));
            lastWeeksDays = lastWeekStart.until(schoolEnds, DAYS) + 1;
            excludeWeeks++;
        }
        long days = ((schoolStarts.until(schoolEnds, WEEKS) - excludeWeeks) * 5); // 7 days per week, weekdays are 5/7 of a week.
        days = days + firstWeekDays + lastWeeksDays;
        System.out.println("Number of school days: " + days);
        System.out.println("");

        //   Hint: keep track of the short weeks also
        // A meeting is schedule for 1:30 PM next Tuesday. If today is Tuesday, assume it is today.
        //   What is the time of the week's meetings?
        LocalTime meetingTime = LocalTime.of(13, 30);
        LocalDate meetingDate = LocalDate.now().with(TemporalAdjusters.nextOrSame(TUESDAY));
        LocalDateTime meeting = LocalDateTime.of(meetingDate, meetingTime);
        System.out.println("The meeting time is: " + meeting);
        System.out.println("");
    }

}
