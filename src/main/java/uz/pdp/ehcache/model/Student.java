package uz.pdp.ehcache.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.io.Serializable;


@Getter
@ToString
@RequiredArgsConstructor
public class Student implements Serializable {

    private final long id;
    private final String firstName;
    private final String lastName;
    private final String courseOfStudies;

}
