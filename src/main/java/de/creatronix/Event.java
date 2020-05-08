package de.creatronix;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Event {
    private String location;
    private String url;
}