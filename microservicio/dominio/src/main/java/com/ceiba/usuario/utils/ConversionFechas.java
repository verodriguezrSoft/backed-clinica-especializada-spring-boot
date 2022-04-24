package com.ceiba.usuario.utils;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class ConversionFechas {

    private ConversionFechas() {
    }

    public static Calendar localDateTimeToCalendar(LocalDateTime localDateTime){
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
        Date fechaSeleccionada = Date.from(zonedDateTime.toInstant());
        Calendar actualCalendar = Calendar.getInstance();
        actualCalendar.setTime(fechaSeleccionada);
        return actualCalendar;
    }


    public static LocalDateTime calendarToLocalDateTime(Calendar calendar){
        TimeZone timeZone = calendar.getTimeZone();
        ZoneId zoneId = timeZone.toZoneId();
        return LocalDateTime.ofInstant(calendar.toInstant(), zoneId);
    }

}
